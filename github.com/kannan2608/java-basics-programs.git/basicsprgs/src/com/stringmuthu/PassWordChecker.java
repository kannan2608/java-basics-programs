package com.stringmuthu;

public class PassWordChecker {

	public static void main(String[] args) {
		String pwd="K8annankkdjdf";
		char[] ch=pwd.toCharArray();
		int nocount=0,capcount=0;
		int splcharcount=0;
		if(ch.length<8)
		{
			System.out.println("not valied pwd");
		}
		else
		{
			for(int i=0;i<ch.length; i++)
			{
				if((ch[i]>=48)&&(ch[i]<=57))
				{
					nocount++;
				}
				else if((ch[i]>=65)&&(ch[i]<=91))
				{
					capcount++;
			    }
				else if(!((ch[i]>97)&&(ch[i]<=122)))
				{
					splcharcount++;
				}
		}
		if((nocount==0)||(capcount==0)||(splcharcount==0))
		{
			System.out.println("not valid pwd");
		}
		else
		{
			System.out.println("valid pwd");
		}
	}

}
}

