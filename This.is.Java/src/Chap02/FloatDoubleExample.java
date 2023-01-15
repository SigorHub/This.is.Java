package Chap02;

public class FloatDoubleExample {
	public static void main(String[] args) {
		double var1 = 3.14;
//		float var2 = 3.14;						//컴파일 에러
		float var3 = 3.14F;						//int의 데이터 범위에 실수가 없기 때문에
												//리터럴값에 F를 붙여야한다
		double var4 = 0.1234567890123456789;
		float var5 = 0.1234567890123456789F;
		
		System.out.println(var1);				//3.14 출력
//		System.out.println(var2);
		System.out.println(var3);				//3.14 출력
		System.out.println(var4);				//0.12345678901234568 출력
		System.out.println(var5);				//0.12345679 출력
		
		int var6 = 3000000;
		double var7 = 3e6;						//e6은 10의 6승이다
		float var8 = 3e6F;
		double var9 = 2e-3;						//e-3은 10의 -3승이다
		
		System.out.println(var6);				//3000000 출력
		System.out.println(var7);				//3000000.0 출력
		System.out.println(var8);				//3000000.0 출력
		System.out.println(var9);				//0.002 출력
	}
}
