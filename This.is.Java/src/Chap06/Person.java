package Chap06;

public class Person {						//final 필드 선언과 초기화
	final String nation = "Korea";			//final필드 초기화
	final String ssn;						//final필드 선언
	String name;							//필드 선언
	public Person(String ssn, String name) {//생성자의 매개값으로 필드 초기화
		this.ssn = ssn;						//final필드 초기화
		this.name = name;					//일반 필드 초기화
	}
}