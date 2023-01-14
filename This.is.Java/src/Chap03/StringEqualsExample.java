package Chap03;

public class StringEqualsExample {					//문자열 비교
	public static void main(String[] args) {		//==연산자는 변수 주소값 비교
		String strVar1 = "전우치";					//equals 메소드는 데이터 비교
		String strVar2 = "전우치";
		String strVar3 = new String("전우치");		//새로운 객체 생성
		System.out.println(strVar1==strVar2);		//true 출력
		System.out.println(strVar1==strVar3);		//false 출력 (객체가 다르다)
		System.out.println(strVar1.equals(strVar2));//true 출력
		System.out.println(strVar1.equals(strVar3));//true 출력
	}
}