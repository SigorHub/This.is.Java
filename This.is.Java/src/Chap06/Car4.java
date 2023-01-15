package Chap06;

public class Car4 {						//다른 생성자를 호출
	String company = "현대";				//company필드 초기화
	String model;
	String color;
	int maxSpeed;
	Car4(){}							//기본 생성자 선언
	Car4(String model){					//매개값 1개 생성자 선언
		this(model, "은색", 250);			//마지막 생성자 매개값 호출
	}
	Car4(String model, String color){	//매개값 2개 생성자 선언
		this(model, color, 250);		//마지막 생성자 매개값 호출
	}
	Car4(String model, String color, int maxSpeed){ //this()가 호출하는 부분
		this.model = model;				//매개값으로 각 필드 초기화
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
