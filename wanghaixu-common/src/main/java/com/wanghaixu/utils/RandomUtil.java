package com.wanghaixu.utils;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class RandomUtil {
	//����1������min-max֮����������������min��maxֵ�������緵��1-3֮������������ô����1��2��3������ȷ�ģ�����4�Ͳ��ԡ� (5��)
	public static int random(int min, int max){
		Random r = new Random();
		return r.nextInt(max-min+1)+min;
	}
	//����2������Сֵmin�����ֵmax֮���ȡsubs�����ظ����������������1-10֮��ȡ3�����ظ������������ô[2,6,9]�ǶԵģ�[3,5,5]�򲻶ԣ���Ϊ5�ظ��ˡ�Ӧ�ó�������100ƪ���������ȡ10ƪ���£��¿����ܻ�ʹ�õ��� (8��)
	public static Set<Integer> subRandom (int min, int max, int subs){
		Set<Integer> set = new HashSet<Integer>();
		while(set.size()!=subs) {
			set.add(random(min,max));
	}
		return set;
	}
	
	//����3������1��1-9,a-Z֮�������ַ��� (8��)
	public static char randomCharacter (){
		String str="123456789qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
		Random r = new Random();
		int i = r.nextInt(str.length()-1);
		char  a = str.charAt(i);
		return a;
	}
	//����4�����ز���length���ַ���(5��)�������ڲ�Ҫ����randomCharacter()���� (4��)
	public static String randomString(int length){
		String c = "";
		for (int i = 0; i <length; i++) {
			c+=randomCharacter();
		}
		return c;
	}
}
