package Chap03;

public class CompareOperatorExample2 {					//비교 연산자
	public static void main(String[] args) {
		int v2 = 1;
		double v3 = 1.0;
		System.out.println(v2==v3);						//true 출력
		double v4 = 0.1;								//부동 소수점 방식은
		float v5 = 0.1f;								//0.1의 근사치를 표현함
		System.out.println(v4==v5);						//false 출력 (타입이 다름)
		System.out.println((float)v4==v5);				//true 출력
		System.out.println((int)(v4*10)==(int)(v5*10));	//true 출력	(정수 변환)
	}
}