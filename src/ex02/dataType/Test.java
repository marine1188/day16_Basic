package ex02.dataType;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		     
			String s = "0123456789"; 
			System.out.println("s:\t" +s + ":\t" + s.length() ); 
		 
			char c = '\0'; // nullchar (NUL) 
		 
			String s2 = s + c; // append NUL 
		 
			System.out.println("s2:\t" + s2 + ":\t" + s2.length() ); 
		 
		   if ( s.equals(s2) ) 
		       System.out.println("s2 equals s") ; 
		   else 
		        System.out.println("s2 does not equal s") ; 
		 
		 
			String s3 = s;  
		 
			// convert to character array  
		    // put NUL in 6th char 
			// replace  
			char[] ca = s3.toCharArray();  
			ca[5] = c; 
			s3 = String.valueOf(ca); 
		 
			System.out.println("s3:\t"+ s3 +  ":\t" + s3.length() ); 
		 
		
		
		
//		String str = new Scanner(System.in).next();
//		
//		System.out.println(str);  // 
//		char op = str.charAt(0);  
//		System.out.println(str.length());  // null 문자를 뺀 크기를 정수형으로 리턴한다.
//		
//		
//		if (str.equals("+")) System.out.println(str);
//		else if(op == '-') System.out.println(op);
	}
}



