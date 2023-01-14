package Chap03;

public class StringConcarExample {			//문자열 연결 연산자
	public static void main(String[] args) {
		String str1 = "JDK" + 6.0;			//문자열과 연산하면 문자열로 취급
		String str2 = str1 + "특징";
		System.out.println(str2);			//JDK6.0특징 출력
		String str3 = "JDK" + 3 + 3.0;		//3과 3.0은 문자열취급 된다
		System.out.println(str3);			//JDK33.0 출력
		String str4 = 3 + 3.0 +"JDK";		//3 + 3.0의 연산이 먼저된다
		System.out.println(str4);			//6.0JDK 출력
	}
}
