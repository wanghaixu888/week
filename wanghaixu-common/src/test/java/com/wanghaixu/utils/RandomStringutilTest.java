package com.wanghaixu.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class RandomStringutilTest {

	@Test
	public void testHasLength() {
		System.out.println(RandomStringutil.generateChineseName());
	}

	@Test
	public void testHasText() {
		System.out.println(RandomStringutil.getRandomString());
	}

	@Test
	public void testRandomChineseString() {
		System.out.println(RandomStringutil.hasLength(" "));
	}

	@Test
	public void testGenerateChineseName() {
		System.out.println(RandomStringutil.hasText(" "));
	}

	@Test
	public void testGetRandomString() {
		System.out.println(RandomStringutil.randomChineseString(5));
	}

}
