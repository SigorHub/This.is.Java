package Chap04;

public class IfExample {							//if문
	public static void main(String[] args) {
		int score = 93;
		if(score>=90) {								//score는 93이므로
			System.out.println("점수가 90보다 큽니다.");	//출력
			System.out.println("등급은 A 입니다");		//출력
		}
		if(score<90)								//중괄호가 없기 때문에
			System.out.println("점수가 90보다 작니다.");	//해당 줄만 if문의 블록이다
			System.out.println("등급은 B 입니다");		//출력 (if문과 상관 없는 실행문)
	}
}