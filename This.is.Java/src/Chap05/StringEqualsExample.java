package Chap05;

public class StringEqualsExample {							//문자열 비교
	public static void main(String[] args) {
		String var1 = "손오공";								//var1과 var2는 손오공 참조
		String var2 = "손오공";								//같은 객체(리터럴) 참조
		if(var1==var2) System.out.println("참조 같음");			//해당 문자열 출력
		else System.out.println("참조 다름");
		if(var1.equals(var2)) System.out.println("문자열 같음");//해당 문자열 출력
		else System.out.println("문자열 다름");

		String var3 = new String ("전우치");					//var3과 var4는 전우치 참조
		String var4 = new String ("전우치");					//각각 새로운 객체를 생성 후 참조
		if(var3==var4) System.out.println("참조 같음");
		else System.out.println("참조 다름");					//해당 문자열 출력
		if(var3.equals(var4)) System.out.println("문자열 같음");//해당 문자열 출력
		else System.out.println("문자열 다름");
	}														//==연산자는 객체의 주소값을 비교한다
}															//equals메소드는 객체의 문자열을 비교