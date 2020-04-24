package com.jiawenfeng.common.util;

import java.util.HashSet;
import java.util.Random;

public class RandomUtil {
	public static int random(int min, int max) {
		Random r =new Random();
		return r.nextInt(max-min +1)+min;
	}

	
	public static int[] subRandom(int min, int max, int subs) {
	HashSet<Integer>set=new HashSet<Integer>();
	while(set.size()!=subs) {
		set.add(random(min,max));
	}
	int [] x=new int[subs];
	int i=0;
	for (Integer interger : set) {
		x[i]=interger;
		i++;
	}
		return x;
	}


	
	
	public static char randomCharacter() {
	String str="1234567890qwertyuioasdfghjklzxcvbnm";
	return str.charAt(random(0,str.length()-1));
	}

	
	
	
	
	
	public static String randomString(int length) {
	StringBuffer sb=new StringBuffer();
	for (int i = 0; i < length; i++) {
		sb.append(randomCharacter());
	}	
		return sb.toString();
		
	}
}
