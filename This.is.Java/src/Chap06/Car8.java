package Chap06;

public class Car8 {							//정적 메소드와 블록
	int speed;								//필드 선언
	void run() {							//호출시 speed필드 출력
		System.out.println(speed+"km/h");
	}
	public static void main(String[] args) {
		Car8 car = new Car8();				//Car8 객체 생성
		car.speed = 60;						//speed 필드값으로 60저장
		car.run();							//60km/h 출력
	}
}