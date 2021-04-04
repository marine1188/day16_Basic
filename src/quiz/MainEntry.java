package quiz;

// 자료형 이용해서 성적처리 및 정보 출력 
public class MainEntry {
//	국어,영어,전산 점수 임의적으로 부여하고  총점 / 평균 까지 출력 
//	이름, 키, 몸무게(실수형)으로 정보 넣고 출력하는 프로그램 작성
	
	public static void main(String[] args) {
		System.out.printf("10진수 %d\n", 10);
		System.out.printf("8진수  %o\n", 10);
		System.out.printf("16진수 %x,  %X \n", 10, 10);
		
		System.out.println("--------------------------------");
		System.out.printf("%d   %d   %d\n", 10, 012,  0xA);
		
		// 0숫자 --> 8진수 ,   0x숫자 --> 16진수
	}
	
}
