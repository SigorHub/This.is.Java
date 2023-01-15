package Chap04;

import java.util.Scanner;						//Scanner 클래스 사용

public class DoWhileExample {					//do-while문
	public static void main(String[] args) {
		System.out.println("메시지를 입력하세요.");
		System.out.println("프로그램을 종료하시려면 q를 입력하세요.");
		Scanner sc = new Scanner(System.in);	//Scanner의 객체 sc생성
		String inputString;						//String타입 변수 선언
		do {									//do-while문의 실행문
			System.out.print(">");
			inputString = sc.nextLine();		//키보드의 입력값을 inputString에 저장
			System.out.println(inputString);	//저장값 출력
		}while(! inputString.equals("q"));		//키보드 입력값이 q라면 종료, 아니면 반복
		System.out.println("프로그램 종료");		//while문 종료 후 "프로그램 종료" 출력
	}											
}