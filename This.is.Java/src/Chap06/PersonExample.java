package Chap06;

public class PersonExample {							//final필드 테스트
	public static void main(String[] args) {
		Person p1 = new Person("123456-1234567","계백");	//필드 초기화
		System.out.println(p1.nation);					//각 필드의 값 출력
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
//		p1.nation = "USA";								//컴파일오류
//		p1.ssn = "654321-1234567";						//final필드는 값 수정 불가
		p1.name = "을지문덕";								//일반 필드는 수정 가능
	}
}