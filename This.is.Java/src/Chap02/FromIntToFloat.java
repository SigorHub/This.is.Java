package Chap02;

public class FromIntToFloat {
	public static void main(String[] args) {
		int num1 = 123456789;			//int타입 변수에 저장 (27비트 데이터)
		int num2 = 123456789;			//float타입은 부동소수점 방식사용 가수 23비트
		float num3 = num2;				//데이터가 23비트를 넘어서 정밀도 손실발생 
		num2 = (int) num3;				//강제타입변환 후 저장 (123456792)
		int result = num1 - num2;		//연산 결과를 변수에 저장
		System.out.println(result);		//-3 출력
	}
}