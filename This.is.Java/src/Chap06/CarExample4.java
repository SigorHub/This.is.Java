package Chap06;

public class CarExample4 {					//객체 생성시 생성자 선택
	public static void main(String[] args) {
		Car4 c1 = new Car4();				//기본 생성자
		System.out.println(c1.company);		//현대 출력
		
		Car4 c2 = new Car4("코나");			//현대, 코나, 은색, 250 출력
		System.out.println(c2.company);		//매개값이 1개일때 생성자에 의해 
		System.out.println(c2.model);		//은색, 250 저장
		System.out.println(c2.color);
		System.out.println(c2.maxSpeed);
		Car4 c3 = new Car4("투싼","흰색");		//현대, 투싼, 흰색, 250 출력
		System.out.println(c3.company);		//매개값이 2개일때 250 저장
		System.out.println(c3.model);
		System.out.println(c3.color);
		System.out.println(c3.maxSpeed);
		Car4 c4 = new Car4("싼타페","검정",200);//현대, 싼타페, 검정, 200 출력
		System.out.println(c4.company);
		System.out.println(c4.model);
		System.out.println(c4.color);
		System.out.println(c4.maxSpeed);
	}
}
