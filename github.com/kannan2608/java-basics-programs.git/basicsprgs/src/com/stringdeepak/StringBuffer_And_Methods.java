package com.stringdeepak;

public class StringBuffer_And_Methods {

	public static void main(String[] args) {
		
		
		// StringBuffer object are mutable
		
		/* When using string and substring
		 * 
		 * if the data does not chage or change one or two times only use string.
		 * if data is constantly or friquently changing like in calculator, notepad we should use stringbuffter
		 
		 */
		// StringBuffer syntax
		
//public final class StringBuffer extends AbstractStringBuffer implements java.io.Serializable,charSequence
		
		
	/* StringBuffer 4 constructor
	 * 
	 * 1.Stringbuffer(){...}
	 * 2.StringBufer(CharSequence seq){...}
	 * 3.StringBuffer(String str){...}
	 * 4.StringBuffer(int capacity){....}
	 * 
	 * String methods
	 * ===============
	 * 
	 * 1.lenght()          int
	 * 2.capacity()        int 
	 * 3.aappedn()         StringBuffer
	 * 4.insert()          StringBuffer
	 * 5.reverse()         StringBuffer
	 * 6.delete()          StringBuffer
	 * 7.deletecharAt()    StringBuffer
	 * 8.replace()         StringBuffer
	 * 9.ensurecapacity()  void
	 * 10.charAt()         char
	 * 11.indexof()        int
	 * 12.lastindexof()    int
	 * 13.substring()      String
	 * 14.subsequence()    charSequence
	 * 15.toString()       String
	 
	 * 
	 */
	    // defalut constructor
		
		StringBuffer sb=new StringBuffer();
		System.out.println(sb.capacity());  // 16 default capacity is 16
		
		
		// String constructor
		
		StringBuffer sb1=new StringBuffer("kannan");
		System.out.println(sb1.capacity());  //16+string lenght thats y output 22
		
		
		// int constructor
		
		StringBuffer sb2=new StringBuffer(100);
		 System.out.println(sb2.capacity()); // 100
		
		 
		 // 1. appedn and  2. capacity 
		 
		 sb.append("hello");
		 System.out.println(sb.capacity());  //16
		 
		 sb.append("hekvjslsjflajflanmfljasjflfjg");
		 System.out.println(sb.capacity());   //36    default is capacity is 16. 16 char after(16*2)+2 value is out put
		
		 
		//3. length
		 
		 StringBuffer sb3=new StringBuffer("kannan become a softwar developer");
		 System.out.println(sb3.length());
		
		  
		 //4. charAt()
		
		System.out.println(sb3.charAt(5)); //n
		
		// 5. delete
		
       	System.out.println(sb3.delete(2, 5)); // kan become a softwar developer
		
		// 6.deletecharAt
       	
       	StringBuffer s1=new StringBuffer("kannan");
		
		System.out.println(s1.deleteCharAt(1));  //knnan
		
		//7. equals
		
		StringBuffer s2=new StringBuffer("kannan java");
		StringBuffer s3=new StringBuffer("kannan java");
		StringBuffer s4=s3.append("developer");
		
		
		System.out.println(s2.equals(s3)); //false
		
		System.out.println(s3.equals(s4)); //true
		
		// 8. index of and lastindexof
		
		System.out.println(s2.indexOf("n"));      //2
		System.out.println(s2.lastIndexOf("a"));   //10
		
		// 9. insert
		
		
		System.out.println(s2.insert(3, "###"));  //kan###nan java
		
		
		//10. replace
		
		System.out.println(s2.replace(1, 3, "koks"));   //kkoks###nan java
		
		
		//11. reverse
		
		System.out.println(s2.reverse());  //avaj nan###skokk
		
		//12 subsequence
		
		StringBuffer t=new StringBuffer("Possiable");
		
		System.out.println(t.subSequence(1,9));     // ossiable
		
		
		//13. Substring
		
		System.out.println(t.substring(5));      //able
		
		
		System.out.println(t.substring(2, 8));   // ssiabl

		
		// 14. ensurecapacity
		
		
		StringBuffer y=new StringBuffer("karthi");
		System.out.println(y.capacity());    //22
		y.ensureCapacity(100);
		System.out.println(y.capacity());     //100
		
		
		//15. setchar
		
		
		y.setCharAt(3, 'Q');
		System.out.println(y);  //  karQhi
		
		//16. SetLenght
		
		
		StringBuffer sb5=new StringBuffer("just do dont thing over much");
		System.out.println(sb5.length());  //28
		
		sb5.setLength(15);
		System.out.println(sb5);  //just do dont th
		  
		
		
		//17. trime to size
		
		
		
		StringBuffer j=new StringBuffer();
		j.ensureCapacity(100);
		j.append("karthi");
		j.trimToSize();
		System.out.println(j.capacity());    //6
			
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
