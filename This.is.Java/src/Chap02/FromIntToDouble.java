package Chap02;

public class FromIntToDouble {
	public static void main(String[] args) {
		int num1 = 123456789;
		int num2 = 123456789;
		double num3 = num2;				//double타입은 가수 52비트
		num2 = (int) num3;				//손실이 발생하지 않는다.
		int result = num1 - num2;
		System.out.println(result);		//0출력
	}
}