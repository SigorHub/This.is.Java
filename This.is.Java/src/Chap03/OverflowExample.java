package Chap03;

public class OverflowExample {		//오버플로우
	public static void main(String[] args) {
		int x = 1000000;
		int y = 1000000;
		int z = x*y;				//int의 데이터범위 (약 21억)
		System.out.println(z);		//-727379968 출력
		long a = 1000000;
		long b = 1000000;
		long c = a*b;				//long의 데이터범위 (약 920경)
		System.out.println(c);		//1000000000000 출력
	}								//데이터의 범위를 넘는 연산값은 (z)
}									//쓰레기값을 출력한다