package Chap06;

public class B1 {			//생성자의 접근 제한
	A1 a1 = new A1(true);	//public 접근가능
	A1 a2 = new A1(1);		//default 접근가능
//	A1 a3 = new A1("문자열");	//private 생성자 접근불가 컴파일 에레
}