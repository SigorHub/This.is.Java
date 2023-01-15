package Chap04;

public class SwitchCharExample {			//char 타입의 switch문
	public static void main(String[] args) {
		char grade = 'B';					//B를 grade에 저장
		switch(grade) {						//switch문의 조건식 grade
		case 'A':
		case 'a':
			System.out.println("우수 회원");
			break;
		case 'B':							//break문이 없기 때문에
		case 'b':							//case B와 b를 모두 실행
			System.out.println("일반 회원");	//일반 회원 출력
			break;							//switch문 종료
		default:							//일치하는 case가 없는 경우 실행
			System.out.println("손님");
		}
	}
}
