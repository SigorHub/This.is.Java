package Chap06;

public class FieldInitValueExample {				//필드값 출력
	public static void main(String[] args) {
		FieldInitValue fiv = new FieldInitValue();	//FieldInitValue객체 생성
		System.out.println(fiv.byteField);			//0 출력
		System.out.println(fiv.shortFiled);			//0 출력
		System.out.println(fiv.intField);			//0 출력
		System.out.println(fiv.longField);			//0 출력
		System.out.println(fiv.booleanField);		//false 출력
		System.out.println(fiv.charField);			//공백 출력
		System.out.println(fiv.floatField);			//0.0 출력
		System.out.println(fiv.doubleField);		//0.0 출력
		System.out.println(fiv.arrField);			//null 출력
		System.out.println(fiv.referenceField);		//null 출력
	}
}