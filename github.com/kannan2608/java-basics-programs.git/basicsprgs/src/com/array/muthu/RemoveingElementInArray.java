package com.array.muthu;

public class RemoveingElementInArray {

	public static void main(String[] args) {
		   int[] arr= {7,8,6,7,65,55};
		   int no=65;
		   int i=0;
		   while(i<arr.length)
		   {
			   if(arr[i]==65 )
			   {
				   break;
			   }
			   i++;
		   }
		   System.out.println("65 is present"+i);
		   for(int j=i; j<arr.length; j++)
		   {
		       arr[j]=arr[j+1];
		       System.out.println(arr[j]);
		   }
			   

	}

}
  