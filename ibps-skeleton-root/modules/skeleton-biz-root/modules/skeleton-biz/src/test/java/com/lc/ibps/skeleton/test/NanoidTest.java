package com.lc.ibps.skeleton.test;

import java.util.Random;

import com.aventrix.jnanoid.jnanoid.NanoIdUtils;

public class NanoidTest {

	public static void main(String[] args) {
		test1();
		test2();
	}
	
	private static void test1() {
		String id = NanoIdUtils.randomNanoId();
		System.out.println("test1 => " + id);
	}
	
	private static void test2() {
		// Use a faster, but non-secure, random generator
		Random random = new Random();
		// Use a custom alphabet containing only a, b, and c
		char[] alphabet = {'a','b','c'};
		// Make IDs 10 characters long
		int size = 10;
		String id = NanoIdUtils.randomNanoId(random, alphabet, size); // "babbcaabcb"
		System.out.println("test2 => " + id);
	}
	
}
