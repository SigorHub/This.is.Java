package Chap04;

public class BreakOutterExample {					//바깥쪽 반복문 종료
	public static void main(String[] args) {		//바깥쪽 반복문의 이름 Outter (라벨)
		Outter: for(char upper='A'; upper<='Z'; upper++) {	//upper는 A부터 Z까지 반복
			for(char lower='a'; lower<='z'; lower++) {		//lower는 a부터 z까지 반복
				System.out.println(upper+"-"+lower);//A-a부터 A-g까지 출력된다
				if(lower=='g') break Outter;		//안쪽 for문의 lower가 g가되면 종료
			}										//바깥쪽 반복문에 Outter라고 이름(라벨)을
		}											//붙였기 때문에 바깥 for문이 종료된다.
		System.out.println("프로그램 실행 종료");			//반복문 탈출 후 출력
	}												
}													//이중반복문은 바깥쪽 반복문이 종료되면 모두종료