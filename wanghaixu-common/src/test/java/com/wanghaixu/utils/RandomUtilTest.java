package com.wanghaixu.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class RandomUtilTest {

	@Test
	public void testRandom() {
		System.out.println(RandomUtil.random(1, 50));
	}

	@Test
	public void testSubRandom() {
		System.out.println(RandomUtil.randomCharacter());
	}

	@Test
	public void testRandomCharacter() {
		System.out.println(RandomUtil.randomString(10));
	}

	@Test
	public void testRandomString() {
		System.out.println(RandomUtil.subRandom(1, 50, 6));
	}

}
