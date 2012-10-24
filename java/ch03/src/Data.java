package com.xing.ch03;

public class Data{
	int first;
	int second;
	public void Data(int aFirst,int aSecond)
	{
		first = aFirst;
		second = aSecond;
	}
	public void outBin(int k)
	{
		int i = 31;
		for(;i >= 0;i--)
		{
			k = (k >> i) & 1;
			System.out.print(k);
		}
		System.out.println();
	}
	public void BinAnd()
	{
		System.out.print("first:" + first + ":");
		System.out.print("second:" + second + ":");
		int res = first & second;
		System.out.print("res:" + res + ":");
	}
}
