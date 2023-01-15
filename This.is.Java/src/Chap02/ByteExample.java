package Chap02;

public class ByteExample {
	public static void main(String[] args) {
		byte var1 = -128;			//byte의 저장 범위는
		byte var2 = -30;				//-128 ~ 127이므로
		byte var3 = -0;
		byte var4 = 30;
		byte var5 = 127;
//		byte var6 = 128;				//컴파일 에러
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);
//		System.out.println(var6);
	}
}