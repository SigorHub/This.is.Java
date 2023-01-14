package Chap03;

public class DenyLogicOperatorExample {	//논리 부정 연산자
	public static void main(String[] args) {
		boolean play = true;			//play의 초기값 treu
		System.out.println(play);		//true 출력
		play = !play;					//논리 부정연산자( ! )
		System.out.println(play);		//false 출력
		play = !play;					//( ! )연산자는 논리값을 바꾼다
		System.out.println(play);		//true 출력
	}
}