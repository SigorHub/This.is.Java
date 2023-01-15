package Chap04;

public class WhileKeyControlExample {					//키보드로 while문 제어
	public static void main(String[] args) throws Exception {	//예외처리
		boolean run = true;								//run의 초기값 treu
		int speed = 0, keyCode = 0;						//int타입 매개변수 초기화
		while(run) {									//while문의 조건식은 run
			if(keyCode!=13 && keyCode!=10) {			//keyCode의 값 13과 10 제외
				System.out.println("--------------------");
				System.out.println("1.증속 | 2.감속 | 3.중지");
				System.out.println("--------------------");
				System.out.print("선택: ");
			}											//1, 2, 3은 각각 49, 50, 51
			keyCode = System.in.read();					//키보드 입력값을 keyCode에저장
			if(keyCode==49) {							//1입력시
				speed++;								//speed 1증가
				System.out.println("현재 속도: "+speed);	//spped값 출력
			}else if(keyCode==50) {						//2입력시
				speed--;								//spped 1감소
				System.out.println("현재 속도: "+speed);	//speed값 출력
			}else if(keyCode==51) {						//3입력시
				run = false;							//run에 false저장 (while문 중료)
			}
		}
		System.out.println("프로그램 종료");				//while문을 탈출하면 출력
	}
}