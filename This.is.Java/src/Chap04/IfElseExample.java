package Chap04;

public class IfElseExample {						//if-else문
	public static void main(String[] args) {
		int score = 85;
		if(score>=90) {								//score는 85이므로
			System.out.println("점수가 90보다 큽니다");
			System.out.println("A등급");
		}else{										//score<90일 경우
			System.out.println("점수가 90보다 작습니다");	//출력
			System.out.println("B등급");				//출력
		}
	}
}