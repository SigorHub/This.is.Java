package Chap04;

public class SwitchStringExample {			//String타입 Switch문
	public static void main(String[] args) {
		String position = "과장";				//문자열 "과장" 저장
		switch(position) {
		case "부장":							//조건문이 부장인 경우
			System.out.println("700만원");
			break;
		case "과장":							//조건문이 과장인 경우
			System.out.println("500만원");
			break;
		default:							//조건문이 case와 일치하지 않으면
			System.out.println("300만원");	//출력 후 switch문 종료
		}
	}
}