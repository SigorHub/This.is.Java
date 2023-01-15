package Chap06;

public class CalculatorExample4 {					//정적 멤버 사용
	public static void main(String[] args) {		//클래스.필드 or 메소드 형식
		double result1 = 10 * 10 * Calculator4.pi;	//정적필드 호출
		int result2 = Calculator4.plus(10, 5);		//정적메소드 호출
		int result3 = Calculator4.minus(10, 5);		//정적멤버는 객체 생성 없이 호출

		System.out.println(result1);				//314.159출력
		System.out.println(result2);				//15 출력
		System.out.println(result3);				//5 출력
	}
}