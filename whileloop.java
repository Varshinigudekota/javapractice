package com.whileloops;

public class whileloop {
	public int findNeonNumber(int num) {
		
		int temp=num;
		int sum=0;
		int square =num*num;
		while(square!=0) {
		sum=sum+(square%10);
		square=square/10;
		}
		if(temp==sum) {
		System.out.println(sum + " is neon number");
		}
		else {
			System.out.println(sum +" is not neon number");
		}
	return 0;
	}
public static void main(String[]args) {
	whileloop obj=new whileloop();
	obj.findNeonNumber(9);
}				
}				
					
					
					
		
	
