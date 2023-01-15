package Chap04;

public class WhileSumFrom1To100Example {	//1부터 100까지 합 출력(while문)
	public static void main(String[] args) {
		int sum = 0, i = 1;					//매개변수 sum과 i를 초기화
		while(i<=100) {						//i가 100을 넘으면 while문 종료
			sum += i;						//sum = sum + i ( 대입 연산자 )
			i++;							//while문 실행시 i는 1씩증가( 증감 연산자 )
		}
		System.out.println(sum);			//5050출력
	}
}