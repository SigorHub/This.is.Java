package Chap04;

public class IfDiceExample {					//주사위 번호 예제
	public static void main(String[] args) {
		int num = (int)(Math.random()*6)+1;		//1~6의 난수를 num에 저장
		if(num==1) {							//num의 결과에 따른 문자열 출력
			System.out.println("1번");
		}else if(num==2) {
			System.out.println("2번");
		}else if(num==3) {
			System.out.println("3번");
		}else if(num==4) {
			System.out.println("4번");
		}else if(num==5) {
			System.out.println("5번");
		}else if(num==6) {
			System.out.println("6번");
		}
	}
}