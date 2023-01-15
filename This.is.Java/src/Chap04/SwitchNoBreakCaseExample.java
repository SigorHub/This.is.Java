package Chap04;

public class SwitchNoBreakCaseExample {				//break문이 없는 case
	public static void main(String[] args) {
		int time = (int)(Math.random()*4)+8;		//8~11의 난수 time에 저장
		System.out.println("[현재시간: "+time+"시]");	//현재시간 출력
		switch(time) {								//time에 값에 맞는 case 실행
		case 8:										//8이 나올경우 전부 실행
			System.out.println("출근합니다.");
		case 9:										//9가 나올 경우 9,10,default실행
			System.out.println("회의합니다.");
		case 10:
			System.out.println("업무봅니다.");
		default:									//break문이 없기 때문에 해당 case부터
			System.out.println("외근나갑니다.");		//default까지의 case를 전부 실행
		}
	}
}