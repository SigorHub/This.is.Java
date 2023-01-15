package Chap04;

public class BreakExample {						//break문으로 while문 종료
	public static void main(String[] args) {
		while(true) {							//while문 무한반복
			int num = (int)(Math.random()*6)+1;	//1~6의 난수를 num에 저장
			System.out.println(num);			//num 출력
			if(num==6) break;					//num에 6이 저장되면 while문 종료
		}
		System.out.println("프로그램 종료");		//while문 종료 후 출력
	}
}