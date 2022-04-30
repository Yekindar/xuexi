package com.lc.ibps.skeleton.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import com.lc.ibps.base.core.util.BeanUtils;
import com.lc.ibps.base.core.util.JacksonUtil;
import com.lc.ibps.base.core.util.ProtobufUtil;
import com.lc.ibps.base.framework.id.SystemClock;
import com.lc.ibps.skeleton.model.AddressVO;

public class ProtobufTest {

	public static void main(String[] args) {
		test1();
		test2();
		test3();
	}
	
	private static void test1() {
		AddressVO vo = new AddressVO();
		vo.setCountry("CN");
		vo.setProvince("GD");
		vo.setCity("GZ");
		vo.setStreet("CP");
		vo.setDetail("9");
		
		byte[] datas = ProtobufUtil.serializer(vo);
		System.out.println("test1.1 => " + Arrays.toString(datas));
		vo = ProtobufUtil.deserializer(datas, AddressVO.class);
		System.out.println("test1.2 => " + JacksonUtil.toJsonString(vo));
	}
	
	@SuppressWarnings("unchecked")
	private static void test2() {
		AddressVO vo = new AddressVO();
		vo.setCountry("CN");
		vo.setProvince("GD");
		vo.setCity("GZ");
		vo.setStreet("CP");
		vo.setDetail("9");
		
		Map<String, Object> map = new HashMap<>();
		map.put("vo", vo);
		
		byte[] datas = ProtobufUtil.serializer(map);
		System.out.println("test2.1 => " + Arrays.toString(datas));
		map = ProtobufUtil.deserializer(datas, HashMap.class);
		System.out.println("test2.2 => " + JacksonUtil.toJsonString(map));
	}
	
	private static void test3() {
		AddressVO vo = new AddressVO();
		vo.setCountry("CN");
		vo.setProvince("GD");
		vo.setCity("GZ");
		vo.setStreet("CP");
		vo.setDetail("9");
		
		long start = SystemClock.now();
		for(int i = 0; i < 1000; i ++) {
			BeanUtils.copy(vo);
		}
		long end = SystemClock.now();
		System.out.println("test2.1 => " + SystemClock.diff(start, end));
		
		start = SystemClock.now();
		for(int i = 0; i < 1000; i ++) {
			ProtobufUtil.copy(vo);
		}
		end = SystemClock.now();
		System.out.println("test2.2 => " + SystemClock.diff(start, end));
	}
	
}
