package Chap02;

public class PromotionExample {
	public static void main(String[] args) {
		byte byteValue = 10;							//byte타입 변수에 10 저장
		int intValue = byteValue;					//byte타입을 int타입 변수에 저장
		System.out.println(intValue);				//10 출력 (자동 타입 변환)

		char charValue = '가';						//char타입 변수에 가 저장
		intValue = charValue;						//char타입을 int타입 변수에 저장
		System.out.println(+intValue);				//44032 출력 ('가'의 유니코드 )

		intValue = 500;								//int타입 변수에 정수 500 저장
		long longValue = intValue;					//int타입을 long타입 변수에 저장
		System.out.println(longValue);				//500 출력 (자동 타입 변환)

		intValue = 200;								//int타입 변수에 정수 200 저장
		double doubleValue = intValue;				//int타입을 double타입 변수에 저장
		System.out.println(doubleValue);				//200.9 출력 (자동 타입 변환)
	}												//데이터의 범위가 큰타입에 작은타입을 대입하는 경우
}													//자동 타입 변환이 일어난다 (Promotion)