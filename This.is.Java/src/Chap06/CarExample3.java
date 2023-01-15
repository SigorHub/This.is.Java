package Chap06;

public class CarExample3 {							//객체 생성시 생성자 선택
	public static void main(String[] args) {
		Car3 c1 = new Car3();						//기본 생성자로 객체 생성
		System.out.println(c1.company);				//현대 출력
		
		Car3 c2 = new Car3("코나");					//매개값 1개로 객체 생성
		System.out.println(c2.company);				//현대 출력
		System.out.println(c2.model);				//코나 출력
		
		Car3 c3 = new Car3("투싼", "red");			//매개값 2개로 객체 생성
		System.out.println(c3.company);				//현대 출력
		System.out.println(c3.model);				//투싼 출력
		System.out.println(c3.color);				//red 출력
		
		Car3 c4 = new Car3("싼타페", "black", 200);	//매개값 3개로 객체 생성
		System.out.println(c4.company);				//현대 출력
		System.out.println(c4.model);				//싼타페 출력
		System.out.println(c4.color);				//black 출력
		System.out.println(c4.maxSpeed);			//200 출력
	}
}