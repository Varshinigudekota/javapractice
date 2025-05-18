package com.factorial;

public class factorial {
	public int factorialNumber(int num){
		int factorial=1;
		int a=1;
		while(a<=num) {
			factorial=factorial*a;
			a++;
		}
		System.out.println("factorial of " +num+ " is : " +factorial);
		return factorial;
	}
	
public static void main(String [] args)
{
	factorial obj=new factorial();
	obj.factorialNumber(2);
}
}
