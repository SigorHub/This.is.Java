package Chap06;

public class Car3 {							//생성자의 오버로딩
	String company = "현대";					//company필드는 현대로 초기화
	String model;							//필드 선언
	String color;
	int maxSpeed;
											//생성자 오버로딩
	Car3(){}								//기본 생성자 필드를 초기화하지 않음
	Car3(String model){						//매개값이 1개인 생성자 매개값으로
		this.model = model;					//model초기화
	}
	Car3(String model, String color){		//매개값이 2개인 생성자 매개값으로
		this.model = model;					//model 초기화
		this.color = color;					//color 초기화
	}
	Car3(String model, String color, int maxSpeed){	//매개값이 3개인 생성자
		this.model = model;					//model 초기화
		this.color = color;					//color 초기화
		this.maxSpeed = maxSpeed;			//maxSpeed 초기화
	}										//생성자를 여러번 선언함으로써
}											//다양한 매개값을 받을 수 있다