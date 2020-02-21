package com.loopsprgs.muthu;

public class Armstrong {

	public static void main(String[] args) {
		int no=153,no2=no;
		int armstrong=0,rem=0;
		while(no>0)
		{
			rem=no%10;
		armstrong=armstrong+(rem*rem*rem);
		no=no/10;
	
		}  
		 if(no2==armstrong)
		 {
			 System.out.println(armstrong);
		 }
	
	}
	

}
