package Chap04;

public class ContinueExample {			//continue를 사용한 for문
	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {		//i가 1부터 10까지 반복된다
			if(i%2 != 0) continue;		//i가 2의 배수가 아니라면 다음 반복문 실행
			System.out.println(i);		//i를 출력 (2의 배수만 출력된다)
		}
	}									//i가 2의배수가 아닐때(홀수)
}										//continue문에 의해서 i는 출력되지 않음