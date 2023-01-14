package Chap03;

public class InputDataCheckNaNExample1 {			//NaN 문자열의 문제점
	public static void main(String[] args) {
		String userInput = "NaN";					//문자열 NaN을 저장
		double value = Double.valueOf(userInput);	//double 타입으로 변환후 변수 value에 저장
		double currentBalance = 10000.0;			//10000.0을 double 타입으로 저장
		currentBalance += value;					//10000.0에 value(NaN)을 더하고 저장
		System.out.println(currentBalance);			//NaN 출력
	}												//NaN값은 산술 연산이 가능하다
}													//Infinity와 NaN은 연산해도 값이 그대로이다