package com.xing.ch03;

public class Date{
	int year;
	int month;
	int day;
	public Date(int aYear,int aMonth,int aDay)
	{
		year = aYear;
		month = aMonth;
		day = aDay;
	}
	public boolean isGreatMonth(){
		boolean res = false;
		switch(month){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				res = true;
				break;
			case 2:
			case 4:
			case 6:
			case 9:
			case 11:
				res = false;
				break;
			default:
					System.out.println("illegal month");
					System.exit(1);
		}
		return res;
	}
	public static void main(String[] args){
		Date d = new Date(2012,10,25);
		System.out.println(d.isGreatMonth()?"great":"little");
		d = new Date(2012,9,11);
		System.out.println(d.isGreatMonth()?"great":"little");
		d = new Date(2012,13,1);	
		System.out.println(d.isGreatMonth()?"great":"little");
	}
}
