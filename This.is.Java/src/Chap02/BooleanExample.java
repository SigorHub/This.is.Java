package Chap02;

public class BooleanExample {
	public static void main(String[] args) {
		boolean stop = true;					//true를 변수 stop 초기화 
		if(stop) {							//if문의 조건식으로 stop 사용
			System.out.println("중지합니다");	//if문의 조건식이 true일 경우 출력
		}else {
			System.out.println("시작합니다");	//if문의 조건식이 false일 경우 출력
		}
	}
}
