package Chap06;

public class C1 {			//생성자의 접근 제한
	A1 a1 = new A1(true);	//모두 접근 가능 (public)
//	A1 a2 = new A1(1);		//패키지가 다르다면 접근 불가 (default)
//	A1 a3 = new A1("문자열");	//같은 클래스가 아니면 접근 불가 (private)
}