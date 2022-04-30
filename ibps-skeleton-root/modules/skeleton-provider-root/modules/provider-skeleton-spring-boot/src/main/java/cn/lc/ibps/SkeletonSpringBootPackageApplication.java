package cn.lc.ibps;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;

import com.lc.ibps.cloud.bootstrap.IbpsApplication;

@SpringBootApplication
@ServletComponentScan
@EnableAutoConfiguration(exclude={
      DataSourceAutoConfiguration.class,
      DataSourceTransactionManagerAutoConfiguration.class/*,
      org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration.class, 
      org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration.class,
      org.springframework.cloud.client.serviceregistry.ServiceRegistryAutoConfiguration.class,
      org.springframework.cloud.client.serviceregistry.AutoServiceRegistrationAutoConfiguration.class*/
})
//@ImportResource(locations={"classpath:conf/ibps-context.xml"})//TODO 注解不生效
public class SkeletonSpringBootPackageApplication implements CommandLineRunner {

	private static Logger LOGGER = LoggerFactory.getLogger(SkeletonSpringBootPackageApplication.class);
	
	static {
		// 设置子线程读取MDC变量
		System.setProperty("log4j2.isThreadContextMapInheritable", "true");
	}
	
	public static void main(String[] args) throws IOException {
		try {
			IbpsApplication.run(SkeletonSpringBootPackageApplication.class, args);
		}
		catch (Exception e) {
			LOGGER.error(e.getMessage(), e);
		}
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}
	
}