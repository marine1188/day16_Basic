package ex02.dataType;

public class DataType {
	public static void main(String[] args) {
		String str = "A";   // 문자열, " ", 2바이트
		char ch = 'A';   // 문자, ' ', 1바이트
		
		char ch2 = 67;   // ASCII 
		int ch3 = 67;
		char ch4 = 'b';  
		
		System.out.println(ch2 + ", " + (int)ch4);
		System.out.println((char)ch3);
		
		int su = 20;  String aa = "happy";   
		double d = 12.34;
		System.out.println("aa = " + aa);
		System.out.println("실수형 데이터 : " + d);

		
		System.out.println("---------------------------");
		System.out.println(300);   // int
		System.out.println(300L);   // long
		System.out.println(3.578); // double
		System.out.println(3.578f);  // float
		
		for(int i = 65; i <= 90; i++) {
			System.out.print( (char)i + " ");
		}
		System.out.println("\n\n--------------------------");
		
		for(int i = 'a'; i <= 'z'; i++) {
			System.out.print( (char)i + "\t");
		}
		
		System.out.println("\n\nboolean type");
		boolean flag = true;
//		int b = flag;
		System.out.println(flag);
		
		float ff = 678.9000f;   // 
		System.out.println(ff);
	}
}







