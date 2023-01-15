package Chap06;

public class Service {						//어노테이션 적용 클래스
	@PrintAnnotation						//기본값
	public void method1() {
		System.out.println("실행 내용1");
	}
	@PrintAnnotation("*")					//value값을 *로 설정
	public void method2() {
		System.out.println("실행 내용2");
	}
	@PrintAnnotation(value="#",number=20)	//value값을 #로 적용 number값 20
	public void method3() {
		System.out.println("실행 내용3");
	}
}