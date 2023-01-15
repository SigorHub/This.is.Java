package Chap04;

public class SwitchExample {				//Switch문
	public static void main(String[] args) {
		int num = (int)(Math.random()*6)+1;	//1~6의 난수를 num에 저장
		switch(num) {						//switch문의 조건식 num
		case 1:
			System.out.println("1번");
			break;
		case 2:
			System.out.println("2번");
			break;
		case 3:
			System.out.println("3번");
			break;
		case 4:
			System.out.println("4번");
			break;
		case 5:
			System.out.println("5번");
			break;
		default:							//num의 값이 case에 없을 경우
			System.out.println("6번");		//6번 출력
			break;							//default는 생략해도 상관없다
		}
	}

}
