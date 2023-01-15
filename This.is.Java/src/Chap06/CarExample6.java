package Chap06;

public class CarExample6 {			//외부에서 메소드 호출
	public static void main(String[] args) {
		Car6 car = new Car6();		//Car6 객체 생성
		car.keyTrunOn();			//키를 돌립니다 출력
		car.run();					//10km/h ~ 50km/h 출력
		int speed = car.getSpeed();	//객체의 필드값을 변수에 저장
		System.out.println(speed);	//50 출력
	}
}