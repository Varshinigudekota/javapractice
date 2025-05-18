package com.amstrong;

public class amstrong {
	public int amstrongNumber(int num) {
		int temp=num;
		int num1=0;
		int rev=0;
		while(num!=0) {
			rev=num%10;
			num1=num1+(rev*rev*rev);
			num=num/10;
		}
		if(temp==num1) {
			System.out.println(num1+ " is amstrong number");
		}
		else {
			System.out.println(num1+ " is not amstrong number");
		}
		
	
	return num1;
}
	public static void main(String [] args)
	{
		
		amstrong obj=new amstrong();
		obj.amstrongNumber(153);
	}
}
