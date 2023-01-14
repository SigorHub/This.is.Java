package Chap03;

public class BitShiftExample {				//비트 이동 연산자
	public static void main(String[] args) {
		System.out.println(1<<3);			//8 출력
		System.out.println(-8>>3);			//-1 출력
		System.out.println(-8>>>3);			//536870911 출력
	}
}