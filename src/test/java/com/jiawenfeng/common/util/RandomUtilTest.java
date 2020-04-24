package com.jiawenfeng.common.util;


import org.junit.Test;

public class RandomUtilTest {

	@Test//����һ���������
	public void testRandom() {
		int i = RandomUtil.random(1, 100);
		System.out.println(i);
		
	}

	@Test//����һ���������������
	public void testSubRandom() {
		int[] is = RandomUtil.subRandom(1, 10, 4);
		for (int i : is) {
			System.out.println(i);
		}
	}

	@Test//����һ��
	public void testRandomCharacter() {
		char character = RandomUtil.randomCharacter();
		System.out.println(character);
	}

	@Test//����ָ�����ȵ��ַ�
	public void testRandomString() {
		String string = RandomUtil.randomString(4);
		System.out.println(string);
	}

}
