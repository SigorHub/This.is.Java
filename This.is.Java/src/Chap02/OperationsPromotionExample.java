package Chap02;

public class OperationsPromotionExample {
	public static void main(String[] args) {
		byte byteValue1 = 10;
		byte byteValue2 = 20;
//		byte byteValue3 = byteValue1 + byteValue2;	//컴파일 에러 연산결과는 int타입
		int intValue = byteValue1 + byteValue2;		//byte타입에 저장 할 수 없다
		System.out.println(intValue);				//30 출력
		
		char charValue1 = 'A';
		char charValue2 = 1;
//		char charValue3 = charValue1 + charValue2;	//컴파일 에러 연산결과는 int타입
		intValue = charValue1 + charValue2;			//char타입에 저장할 수 없다
		System.out.println(intValue);				//66 출력
		
		int intValue1 = 10;						
		intValue = intValue1/4;						//int타입은 나눗셈 연산시 소수점은 버림
		System.out.println(intValue);				//2 출력
		
		int intValue2 = 10;
//		int intValue3 = 10 / 4.0;					//컴파일 에러 연산결과는 double타입
		double doubleValue = 10 / 4.0;				//4.0은 실수값 결과 double로 자동타입변환 
		System.out.println(doubleValue);				//2.5 출력
	}
}