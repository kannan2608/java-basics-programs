package com.oops;
//Constructors 
public class Students {
	String name;
	int mark;
	
  Students()
  {
	  name="kannan";
	  mark=49;
  }

  Students(String str)
  {
	  name="koks";
	 
  }
	public static void main(String[] args) {
		Students s1 = new Students();
		Students s2 = new Students("koks");
		
		System.out.println(s1.name);
		System.out.println(s1.mark);
		
		System.out.println(s2.name);
     


	}

}
