package Chap03;

public class ArithmeticOperatorExample {	//산술 연산자
	public static void main(String[] args) {
		int v1 = 5;
		int v2 = 2;
		int result1 = v1+v2;				//덧셈
		System.out.println(result1);		//7 출력
		int result2 = v1-v2;				//뺄셈
		System.out.println(result2);		//3 출력
		int result3 = v1*v2;				//곱셈
		System.out.println(result3);		//10 출력
		int result4 = v1/v2;				//나눗셈
		System.out.println(result4);		//2 출력
		int result5 = v1%v2;				//나눈 나머지값
		System.out.println(result5);		//1 출력
		double result6 = (double)v1/v2;		//v1 강제타입변환 후 연산값 double타입 저장
		System.out.println(result6);		//2.5 출력
	}
}