package Chap06;

public class Calculator {					//메소드 선언
	void powerOn() {						//리턴값이 없으며
		System.out.println("전원On");}		//호출시 "전원On"출력
	int plus(int x, int y) {				//int타입 데이터를 매개값으로 받아서
		return x+y;}						//두 매개값을 더한 후 int타입으로 리턴
	double divide(int x, int y) {			//int타입 데이터를 매개값으로 받는서
		return (double)x/y;}				//나누기 연산 후 double타입으로 리턴
	void powerOff() {						//리턴값이 없고 매개값도 없다
		System.out.println("전원Off");}		//호출시 "전원Off"출력
}