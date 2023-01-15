package Chap06;

public class Calculator2 {					//클래스 내부에서 메소드 호출
	int plus(int x, int y) {return x+y;}	//호출시 매개값을 더한후 리턴
	double avg(int x, int y) {				//호출시 매개값을 더한 후 2.0으로 나눈값 리턴
		double sum = plus(x,y);				//매개값을 더한 후 double타입으로 저장(plus호출)
		return sum/2;	}					//매개변수 sum을 2로 나눈 값을 리턴
	
	void execute() {						//호출시 avg와 println을 호출하여 문자열을 출력
		double result = avg(7,10);			//매개값으로 avg메소드 호출후 리턴값을 저장하여
		println("결과 : "+result);	}		//println메소드의 매개값으로 호출한다
	void println(String message) {			//String타입의 매개값을 받아서
		System.out.println(message);	}	//매개값을 출력한다
}