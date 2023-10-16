package com.java.conceps;

import java.util.Arrays;
import java.util.Scanner;

public class stringsso {

	public static void main(String[] args) {
		
		String s1 = "vijay";
		String s2 = "K";
		int i =20;
		System.out.println("1 Concatination:" +s1+s2);
		System.out.println("2 StartsWith:" +s1.startsWith("vi"));
		System.out.println("3 EndsWith:" +s1.endsWith("y"));
		System.out.println("4 Contains:" +s1.contains("a"));
		String s3 =" vijaY ";
		System.out.println( s1==s3);
		String s5 = s1+" "+s2;
		System.out.println("6" + s5);
		System.out.println("7Equals:" +s1.equals(s3));
		System.out.println("8EqualsIgnoreCae:"+ s1.equalsIgnoreCase(s3));
		System.out.println("9Length:" +s3.length());
		System.out.println("10Trim:"+ s3.trim().length());
		System.out.println(s3.toCharArray());
		System.out.println("11LowerCase:" +s3.toLowerCase());
		System.out.println("12UpperCase:"+ s3.toUpperCase());
		System.out.println("13IndexOf:" + s3.indexOf("a"));
		System.out.println("14LastIndexOF:" + s3.charAt(0));
		System.out.println(s5.split(" "));
		System.out.println(Arrays.toString(s5.split(" "))); 	//splitting arrays.tostring 
		Integer y = Integer.valueOf(i);
		System.out.println(i);
		System.out.println(s3.isBlank());
		System.out.println(s3.isEmpty());
		
		StringBuffer sbf = new StringBuffer("BUffer Vijay");
		System.out.println(sbf);
		StringBuffer sbf2 = new StringBuffer("BUFfer Kumar");
		System.out.println(sbf2);
		sbf.append("undrajavarapu");
		System.out.println(sbf);
	}

}
