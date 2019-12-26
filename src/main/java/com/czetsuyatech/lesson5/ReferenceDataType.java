package com.czetsuyatech.lesson5;

public class ReferenceDataType {

	String str;

	public static void main(String args[]) {

		new ReferenceDataType();
	}

	public ReferenceDataType() {

		System.out.println("non-primitive");
		// non-primitive data types
		String str1 = new String("hello world1");
		String str2 = "hello world2";
		String str3;

		System.out.println(str1);
		System.out.println(str2);
		System.out.println("String defaultValue=" + str);
		// again this will not work
		// System.out.println(str3);

		// auto boxing
		Integer x = 10;
		System.out.println("autoboxing=" + x);
	}
}
