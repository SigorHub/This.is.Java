package Chap06;

public class Korean {				//생성자에서 필드 초기화
	String nation = "대한민국";			//nation필드 대한민국으로 초기화
	String name;					//필드 선언
	String ssn;
	public Korean(String name, String ssn) {
		this.name = name;			//생성자의 매개값(name)을 필드의 name에 저장
		this.ssn = ssn;				//생성자의 매개값을 필드의 ssn 초기화
	}
}