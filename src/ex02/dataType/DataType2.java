package ex02.dataType;

public class DataType2 {
	public static void main(String[] args) {
		short sh = 3;   // -32768 ~ 32767 : 2byte
		int num = 50000;  // -21�� ~ 21�� : 4byte
	    System.out.println("sh = " + sh);
	    System.out.println("num = " + num);
		
		//���� �ڷ����� ū�ڷ�����..... �ڵ�����ȯ(����������ȯ) �ȴ�
		//num = sh;   
	    
	    //ū �ڷ����� ���� �ڷ����� �������� ����� ����ȯ �ؾ��Ѵ�. (������ �ս� �߻�)
	    sh = (short)num;    // short(2byte)  =  int(4byte) 
	    
	    System.out.println("sh = " + sh);
	    System.out.println("num = " + num);
	    
	    // ��� �ڷ����� �ڽ��� ���� ũ�⸦ �ȹ����.
	    num = 32768;
	    sh = (short)num;
	    System.out.println("sh = " + sh);
	    System.out.println("num = " + num);
	    
	}
}



