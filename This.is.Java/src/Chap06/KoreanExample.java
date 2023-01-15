package Chap06;

public class KoreanExample {							//객체 생성 후 필드값 출력
	public static void main(String[] args) {
		Korean k1 = new Korean("자바", "230115-3234567");	//생성자에의해 필드값 초기화
		System.out.println(k1.name);					//k1객체의 name 필드값 출력
		System.out.println(k1.ssn);						//k1객체의 ssn 필드값 출력
		
		Korean k2 = new Korean("파이썬", "230701-4234567");
		System.out.println(k2.name);
		System.out.println(k2.ssn);
	}
}