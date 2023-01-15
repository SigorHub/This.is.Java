package Chap04;

public class WhilePrintFrom1To10Example {	//1부터 10까지 출력(while문)
	public static void main(String[] args) {
		int i=1;							//i의 초기값을 1로 저장
		while(i<=10) {						//i의 값이 11이 되면 종료
			System.out.println(i);			//i출력 (1~10까지 10번 출력)
			i++;							//while문 1번 실행할때 i는 1증가
		}
	}
}