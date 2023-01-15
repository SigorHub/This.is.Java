package Chap06;

public class Calculator4 {				//정적 멤버 사용
	static double pi = 3.14159;			//정적 필드 pi
	static int plus(int x, int y) {		//정적 메소드 plus
		return x+y;	}					//매개값을 +연산 후 리턴
	static int minus(int x, int y) {
		return x-y;	}					//매개값을 -연산 후 리턴
}