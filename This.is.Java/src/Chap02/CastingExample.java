package Chap02;

public class CastingExample {

	public static void main(String[] args) {
		int intValue = 44032;					//int타입 변수에 44032저장
		char charValue = (char) intValue;		//char타입으로 강제 타입 변환
		System.out.println(charValue);			//가 출력
		
		long longValue = 500;					//long타입 변수에 500저장
		intValue = (int) longValue;				//int타입으로 강제 타입 변환
		System.out.println(intValue);			//500 출력
		
		double doubleValue = 3.14;				//double타입 변수에 3.14저장
		intValue = (int) doubleValue;			//int타입으로 강제 타입 변환
		System.out.println(intValue);			//3출력
	}											//int타입의 데이터 범위는 정수이기 때문에
}												//실수 부분은 데이터 손실이 발생한다 (Casting)