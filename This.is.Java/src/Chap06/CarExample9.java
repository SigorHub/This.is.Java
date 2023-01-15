package Chap06;

public class CarExample9 {						//Getter와 Setter 메소드 사용
	public static void main(String[] args) {
		Car9 car = new Car9();					//Car9의 객체 생성
		car.setSpeed(-50);						//잘못된 speed 설정
		System.out.println(car.getSpeed());		//0 출력
		car.setSpeed(60);						//Setter에의해 speed필드값은 60저장
		System.out.println(car.getSpeed());		//60 출력
		if(!car.isStop()) {						//stop필드값이 false라면
			car.setStop(true);					//stop필드값에 true저장, speed필드값 0저장
		}
		System.out.println(car.getSpeed());		//0 출력
	}
}