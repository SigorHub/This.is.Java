package Chap03;

public class ConditionalOperationExample {		//삼항연산자
	public static void main(String[] args) {
		int score = 85;							//int를 85로 초기화
		char grade = (score > 90)? 'A' : (score > 80)? 'B' : 'C';
		System.out.println(grade);				//B 출력
	}											//90보다 크면 A
}												//80보다 크면 B 작으면 C