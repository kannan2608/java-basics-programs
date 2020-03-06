package com.string;

import java.util.ArrayList;

public class ArgumentExample1 {

	public static void main(String[] args) {

		ArrayList Frds = new ArrayList();
		Frds.add("kannan");
		Frds.add("karthi");
		Frds.add("Babu");
		Frds.add("Dinesh");
		Frds.add("krishna");
		Frds.add("jack");
		System.out.println(Frds);

		for (Object res : Frds) {
			if (res.equals("Babu"))
				System.out.println(res);
		}

		Object res1 = Frds.get(4);
		System.out.println(res1);

		boolean res2 = Frds.contains("karthi");
		System.out.println(res2);

		boolean res4 = Frds.remove("k");
		System.out.println(res4);

		Object res5 = Frds.remove(5);
		System.out.println(res5);
		System.out.println(Frds);
		
		void res8= Frds.clear("kannan");
		
	
	
		

	}

}
