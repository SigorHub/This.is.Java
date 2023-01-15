package Chap06;

public class Car6 {						//클래스 외부에서 메소드 호출
	int speed;							//필드 선언
	int getSpeed() {return speed;}		//호출시 speed필드값을 리턴
	void keyTrunOn() {					//호출시 문자열 호출
		System.out.println("키를 돌립니다");
	}
	void run() {						//호출시 speed필드값 수정 및 문자열출력
		for(int i=10; i<=50; i+=10) {	//i는 10부터 50까지 반복 10씩 증가
			speed = i;					//speed필드값에 i저장
			System.out.println(speed+"km/h");//5번 반복해서 출력
		}
	}
}