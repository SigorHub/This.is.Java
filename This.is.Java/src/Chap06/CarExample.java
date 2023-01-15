package Chap06;

public class CarExample {						//외부 클래스에서 Car필드값 수정
	public static void main(String[] args) {
		Car myCar = new Car();					//Car클래스의 객체 생성
		System.out.println(myCar.company);		//현대자동차 출력
		System.out.println(myCar.model);		//그랜저 출력
		System.out.println(myCar.color);		//검정 출력
		System.out.println(myCar.maxSpeed);		//350 출력
		System.out.println(myCar.speed);		//0 출력
		
		myCar.speed = 60;						//Car객체의 speed필드에 60저장
		System.out.println(myCar.speed);		//60 출력
	}
}