package ex02.dataType;

public class MainEntry {
	
	static int Num;  // ������ : 0, �Ǽ��� : 0.0 , ������ : NULL
	static String str;
	
	public static void main(String[] args) {
		int su=30;   // ���������� �ݵ�� �ʱ�ȭ �ϰ� ����Ѵ�.
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
		
//		System.out.println(ch + ", " + y);  // stack ������ �� �ִ� ������ ���� ������ �޸𸮿��� ��������.
	}
}



