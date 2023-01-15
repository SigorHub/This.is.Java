package Chap02;

public class LongExample {
	public static void main(String[] args) {
		long var1 = 10;
		long var2 = 20L;
		long var3 = 10000000000L;		//int타입의 저장 범위를 넘어가면 L을 붙여야한다
//		long var4 = 10000000000;			//컴파일 에러
		
		System.out.println(var1);		//10출력
		System.out.println(var2);		//20출력
		System.out.println(var3);		//10000000000출력
//		System.out.println(var4);
	}
}