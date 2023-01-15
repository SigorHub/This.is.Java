package Chap06;

public class Singleton {				//싱글톤
	private static Singleton singleton = new Singleton(); //정적필드 선언후 객체생성
	private Singleton() {}				//private 기본 생성자 (외부에서 접근 불가)
	static Singleton getInstance() {	//정적 메소드 호출시
		return singleton;				//싱글톤 객체 리턴
	}
}