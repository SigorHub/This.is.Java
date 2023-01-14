package Chap03;

public class BitReverseOperatorExample {				//비트반전 연산자
	public static void main(String[] args) {
		int v1 = 10;									//10을 v1에 저장
		int v2 = ~v1;									//v1반전 후 v2에저장
		int v3 = ~v1 + 1;								//v1반전 후 +1 연산값 저장
		System.out.println(toBinaryString(v1));			//00000000000000000000000000001010
		System.out.println(toBinaryString(v2));			//11111111111111111111111111110101
		System.out.println(toBinaryString(v3));			//11111111111111111111111111110110
		
		int v4 = -10;									//-10을 v4에 저장
		int v5 = ~v4;									//v4반전 후 v5에 저장
		int v6 = ~v4 +1;								//v4반전 후 +1 연산값 저장
		System.out.println(toBinaryString(v4));			//11111111111111111111111111110110
		System.out.println(toBinaryString(v5));			//00000000000000000000000000001001
		System.out.println(toBinaryString(v6));			//00000000000000000000000000001010
	}
														//toBinaryString 오버라이딩
	public static String toBinaryString(int value) {	//매개값으로 int타입을 받아 String값을 리턴
		String str = Integer.toBinaryString(value);		//매개값 value를 2진수 변환후 String타입으로 저장
		while(str.length() < 32) {						//변수 str의 길이가 32가 될때까지 반복
			str = "0"+str;								//str의 앞을 문자열 0으로 채움
		}
		return str;										//문자열 32자리의 str의 값 리턴
	}
}