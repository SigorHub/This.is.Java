package Chap06;

public class CalculatorExample {				//메소드 호출
	public static void main(String[] args) {
		Calculator cal = new Calculator();		//Calculator 객체 생성
		cal.powerOn();							//powerOn메소드 호출 (전원On)
		System.out.println(cal.plus(5, 6));		//plus메소드 호출 리턴값 출력 (11)
		System.out.println(cal.divide(10, 4));	//divide메소드 호출 리턴값 출력 (2.5)
		cal.powerOff();							//powerOff메소드 호출 (전원Off)
	}
}