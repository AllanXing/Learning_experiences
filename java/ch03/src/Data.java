package com.xing.ch03;

public class Data{
	int first;
	int second;
	public Data(int aFirst,int aSecond)
	{
		first = aFirst;
		second = aSecond;
	}
	public void displayBin(int d)
	{
		/*
		int i = 31;
		for(;i >= 0;i--)
		{
			int k = (d >> i) & 1;
			System.out.print(k);
		}
		System.out.println();
		*/
		int i = 31;
		while(i >= 0)
		{
			int k = (d >> i) & 1;
			System.out.print(k);
			i--;
		}
		System.out.println();
	}
	public void displayBitAnd()
	{
		System.out.print("first:" + first + ":");
		displayBin(first);
		System.out.print("second:" + second + ":");
		displayBin(second);
		int res = first & second;
		System.out.print("res:" + res + ":");
		displayBin(res);
	}
	public void displayBitOr()
	{
		System.out.print("first:" + first + ":");
		displayBin(first);
		System.out.print("second:" + second + ":");
		displayBin(second);
		int res = first | second;
		System.out.print("res:" + res + ":");
		displayBin(res);
	}
	public void displayBitXor()
	{
		System.out.print("first:" + first + ":");
		displayBin(first);
		System.out.print("second:" + second + ":");
		displayBin(second);
		int res = first ^ second;
		System.out.print("res:" + res + ":");
		displayBin(res);
	}
	public void displayLeftShiftSym()
	{
		System.out.print("num  :" + first + ":");
		displayBin(first);
		System.out.print("shift:" + second + ":");
		displayBin(second);
		int res = first << second;
		System.out.print("res  :" + res + ":");
		displayBin(res);
	}
	public void displayRightShiftNoSym()
	{
		System.out.print("num  :" + first + ":");
		displayBin(first);
		System.out.print("shift:" + second + ":");
		displayBin(second);
		int res = first >>> second;
		System.out.print("res  :" + res + ":");
		displayBin(res);
	}
	public void displayRightShiftSym()
	{
		System.out.print("num  :" + first + ":");
		displayBin(first);
		System.out.print("shift:" + second + ":");
		displayBin(second);
		int res = first >> second;
		System.out.print("res  :" + res + ":");
		displayBin(res);
	}


}
