package com.czetsuyatech.lesson5;

public class PrimitiveDataType {

	// class level primitive data types
	byte b1;
	short s1;
	int i1;
	long l1;
	float f1;
	double d1;
	boolean bool1;
	char c1;

	public static void main(String[] args) {

		new PrimitiveDataType();
	}

	public PrimitiveDataType() {

		// method level primitive data types
		byte b = 1;
		short s = 1;
		int i = 1;
		long l = 1l;
		float f = 1.0f;
		double d = 1.0d;
		boolean bool = true;
		char c = 'c';

		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(bool);
		System.out.println(c);

		System.out.println("\nPrinting default values");
		System.out.println(b1);
		System.out.println(s1);
		System.out.println(i1);
		System.out.println(l1);
		System.out.println(f1);
		System.out.println(d1);
		System.out.println(bool1);
		System.out.println("charValue=" + c1);

		// scientific number
		float fs = 1e3f;
		System.out.println("scientific number=" + fs);

		// uninitialized variable inside a method or constructor generates a compilation
		// error
//		 byte b6;
//		 System.out.println(b6);

		// overflow
//		 byte b2 = 111111111111;
//		 short s2 = 111111111111111;
		// int i2 = 11111111111111111111111111;
		// long l2 = 1111111111111111111111111111111111111111111111111111111111;

		int i3 = Integer.MAX_VALUE;
		int j3 = i3 + 1;
		System.out.println("maxValue=" + Integer.MAX_VALUE + ", actualValue=" + j3);

		int i4 = Integer.MIN_VALUE;
		int j4 = i4 - 1;
		System.out.println("minValue=" + Integer.MIN_VALUE + ", actualValue=" + j4);
	}

}
