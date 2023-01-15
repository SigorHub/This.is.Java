package Chap04;

public class ForSumFrom1To100Example1 {		//1부터 100까지 합 출력
	public static void main(String[] args) {
		int sum = 0;						//sum을 0으로 초기화
		for(int i=1; i<=100; i++) sum += i;	//sum에 1~100까지 전부 더함
		System.out.println("1~100 합: "+sum);//5050 출력
	}
}