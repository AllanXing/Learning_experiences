package com.xing.ch03;

public class DataTest{
	public static void main(String[] args){
		Data data = new Data(3,5);
		Data data1 = new Data(-5,2);

		System.out.println("--bit and");
		data.displayBitAnd();

		System.out.println("--bit or");
		data.displayBitOr();

		System.out.println("--bit xor");
		data.displayBitXor();

		System.out.println("--bit <<");
		data1.displayLeftShiftSym();

		System.out.println("--bit >>>");
		data1.displayRightShiftNoSym();

		System.out.println("--bit >>");
		data1.displayRightShiftSym();
	}
}
