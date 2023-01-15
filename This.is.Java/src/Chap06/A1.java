package Chap06;

public class A1 {			//생성자의 접근제한
	A1 a1 = new A1(true);	//필드
	A1 a2 = new A1(1);
	A1 a3 = new A1("문자열");
							//생성자
	public A1(boolean b) {}	//public 접근제한
	A1(int i){}				//defualt 접근제한
	private A1(String s) {}	//private 접근제한
}