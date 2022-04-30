package com.lc.ibps.skeleton.test;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.List;

import com.lc.ibps.base.core.util.BeanUtils;

import cn.hutool.core.io.FileUtil;

public class SqlFileTest {

	public static void main(String[] args) {
		boolean isTenant = false;
		String database = "ibps";
		transfer(isTenant, mysqlSourceDir(), database);
		//transfer(isTenant, dmSourceDir(), database);
		//transfer(isTenant, oracleSourceDir(), database);
		//transfer(isTenant, postgresSourceDir(), database);
		//transfer(isTenant, mssqlSourceDir(), database);
	}

	private static void transfer(boolean isTenant, String sourceDir, String database) {
		String baseDirPath = "E:\\lc_code_repo\\ibps_3.x\\ibps_v3.x_dev\\ibps-other-root\\modules\\db\\6_out";
		String ddlDirPath = sourceDir + "\\DDL";
		String dmlDirPath = sourceDir + "\\DML";
		String saasDdlDirPath = "tenant\\" + ddlDirPath;
		String saasDmlDirPath = "tenant\\" + dmlDirPath;
		String outputDdlPlatformSql = "1." + database + ".ddl.platform.sql";
		String outputDmlPlatformSql = "1." + database + ".dml.platform.sql";
		String outputDdlBusinessSql = "2." + database + ".ddl.business.sql";
		String outputDmlBusinessSql = "2." + database + ".dml.business.sql";
		
		// 0_*/1_*
		FilenameFilter platformFileFilter = new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				return name.startsWith("0_") || name.startsWith("1_");
			}
		};
		if(isTenant) {
			transferSql(baseDirPath, platformFileFilter, outputDdlPlatformSql, ddlDirPath, saasDdlDirPath);
			transferSql(baseDirPath, platformFileFilter, outputDmlPlatformSql, dmlDirPath, saasDmlDirPath);
		}
		else {
			transferSql(baseDirPath, platformFileFilter, outputDdlPlatformSql, ddlDirPath);
			transferSql(baseDirPath, platformFileFilter, outputDmlPlatformSql, dmlDirPath);
		}
		
		// 0_*/2_*/3_*
		FilenameFilter businessFileFilter = new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				return name.startsWith("0_") || name.startsWith("2_") || name.startsWith("3_");
			}
		};
		transferSql(baseDirPath, businessFileFilter, outputDdlBusinessSql, ddlDirPath);
		transferSql(baseDirPath, businessFileFilter, outputDmlBusinessSql, dmlDirPath);
	}
	
	private static String mysqlSourceDir() {
		return "mysql-innoDB";
	}
	
	private static String dmSourceDir() {
		return "oracle11g1108";
	}
	
	private static String oracleSourceDir() {
		return "oracle11g1108";
	}
	
	private static String postgresSourceDir() {
		return "postgres";
	}
	
	private static String mssqlSourceDir() {
		return "sqlServer2008";
	}

	private static void transferSql(String baseDirPath, FilenameFilter fileFilter, String output, String ... distDirPaths) {
		if(BeanUtils.isEmpty(distDirPaths)) {
			return;
		}
		
		File sqlFile = new File(output);
		if(sqlFile.exists()) {
			sqlFile.delete();
		}
		
		List<String> sqls = new ArrayList<>();
		for(String distDirPath : distDirPaths) {
			File dir = new File(baseDirPath + File.separator + distDirPath);
			String[] files = dir.list(fileFilter);
			for(String file : files) {
				sqls.addAll(FileUtil.readUtf8Lines(dir + File.separator + file));
			}
		}
		FileUtil.writeUtf8Lines(sqls, sqlFile);
		System.out.println(String.format("Write to %s", output));
	}
	
}
