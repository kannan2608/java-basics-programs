package com.array.muthu;

public class SwappingArray {

	public static void main(String[] args) {
		int[] marks= {91,76,92,89,98};
		int i=0;
		int temp=marks[i];
		while(i<marks.length-1)
		{
			marks[i]=marks[i+1];
			i++;
		}
			
		marks[i]=temp;
		for(int j=0; j<marks.length; j++)
		{
		System.out.println(marks[j]);
	}

}
}
