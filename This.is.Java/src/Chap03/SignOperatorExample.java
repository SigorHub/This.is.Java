package Chap03;

public class SignOperatorExample {
	public static void main(String[] args) {
		int x = -100;					//int타입 변수에 x에 -100저장
		int result1 = +x;
		int result2 = -x;				//-연산자를 사용 부호반대
		System.out.println(result1);		//-100 출력
		System.out.println(result2);		//100 출력
		
		short s = 100;					//short타입 변수에 100저장
//		short result3 = -s;				//컴파일 에러 부호 연산시 int타입이 된다
		int result3 = -s;				//연산결과를 int타입 변수에 저장
		System.out.println(result3);		//-100 출력
	}
}