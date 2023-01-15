package Chap04;

public class ForSumFrom1To100Example2 {				//1부터 100의 합 출력
	public static void main(String[] args) {
		int sum = 0;								//sum 0으로 초기화
		int i = 0;									//for문 밖에서 i를 먼저 선언
		for(i=1; i<=100; i++) sum += i;				//반복마다 sum에 i를 더한다
		System.out.println("1~"+(i-1)+" 합 :"+sum);	//5050 출력
	}
}