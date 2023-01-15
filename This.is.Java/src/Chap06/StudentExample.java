package Chap06;

public class StudentExample {					//클래스로부터 객체 생성
	public static void main(String[] args) {
		Student s1 = new Student();				//new연산자로 객체 생성시
		System.out.println("s1 변수는 Student 객체를 참조");
		Student s2 = new Student();				//s1과 s2는 별개의 객체이다
		System.out.println("s2 변수는 다른 Student 객체 참조");
	}
}