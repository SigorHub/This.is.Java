package Chap06;

public class CalculatorExample3 {					//메소드 오버로딩
	public static void main(String[] args) {		//매개값이 다양해진
		Calculator3 cal = new Calculator3();		//Calculator3 객체생성
		double result1 = cal.areaRectangle(10);		//10*10 연산결과 저장
		double result2 = cal.areaRectangle(10,20);	//10*20 연산결과 저장
		System.out.println(result1);				//100.0 출력
		System.out.println(result2);				//200.0 출력
	}
}
