package ex02.dataType;

public class MainEntry {
	
	static int Num;  // 정수형 : 0, 실수형 : 0.0 , 문자형 : NULL
	static String str;
	
	public static void main(String[] args) {
		int su=30;   // 지역변수는 반드시 초기화 하고 사용한다.
		System.out.println("su = " + su);
		
		su = 900;
		System.out.println(su);
		System.out.println(Num);
		System.out.println(str);
		
		{
			char ch = 'K';
			int y = 9999;
			
			System.out.println(ch + ", " + y);
		}
		
//		System.out.println(ch + ", " + y);  // stack 영역에 들어가 있는 변수는 블럭이 닫히면 메모리에서 지워진다.
	}
}



