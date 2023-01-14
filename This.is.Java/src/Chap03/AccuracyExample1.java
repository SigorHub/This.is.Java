package Chap03;

public class AccuracyExample1 {						//부동소수점 타입의 계산
	public static void main(String[] args) {
		int apple = 1;								//1을 int타입 변수에 저장
		double pieceUnit = 0.1;						//0.1을 double 타입 변수에 저장
		int number = 7;								//7을 int타입 변수에 저장
		double result = apple - number*pieceUnit;	//1 - 0.1 * 7의 연산결과를 변수에 저장
		System.out.println(result);					//0.29999999999999993 출력
	}												//부동소수점 타입은 근사치로 처리하게 된다
}