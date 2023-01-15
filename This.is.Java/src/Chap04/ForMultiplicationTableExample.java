package Chap04;

public class ForMultiplicationTableExample {			//구구단 출력
	public static void main(String[] args) {			//중첩 for문 (이중 for문)
		for(int m=2; m<=9; m++) {						//m을 2초기화, 9까지반복 반복시 m은 1증가 
			System.out.println("*** "+m+"단 ***");		//문자열 m단 출력
			for(int n=1; n<=9; n++) {					//n은 초기값 1이며 9번 반복
				System.out.println(m+"x"+n+"="+(m*n));	//2x1=2부터 9x9=81까지 구구단 출력
			}
		}												//첫번째 for문은 8번 반복하며, 1번 실행할떄
	}													//두번째 for문은 9번 반복하게 된다
}														//즉 두번째 for문은 총 72번 반복한다 