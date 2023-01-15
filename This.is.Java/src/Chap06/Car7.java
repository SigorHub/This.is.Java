package Chap06;

public class Car7 {								//인스턴스 멤버와 this
	String model;
	int speed;
	Car7(String model){this.model=model;}		//생성자로 model 초기화
	void setSpeed(int speed) {this.speed=speed;}//호출시 매개값으로 speed 초기화
	void run() {								//호출시 setSpeed 호출 및 문자열출력
		for(int i=10; i<=50; i+=10) {			//i는 10부터 50까지 반복 10씩증가
			this.setSpeed(i);					//i를 매개값으로 메소드 호출(인스턴스멤버 접근)
			System.out.println(this.model+this.speed);//필드값 출력
		}
	}
}