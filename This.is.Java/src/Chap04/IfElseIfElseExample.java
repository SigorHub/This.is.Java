package Chap04;

public class IfElseIfElseExample {				//if-else if-else문
	public static void main(String[] args) {
		int score = 75;							//score는 75점
		if(score>90) {
			System.out.println("점수는 100~90");
			System.out.println("A등급");
		}else if(score>=80) {					//80<=score<90
			System.out.println("점수는 80~89");
			System.out.println("B등급");
		}else if(score>=70) {					//70<=score<80
			System.out.println("점수는 70~79");	//출력
			System.out.println("C등급");			//출력
		}else {									//score<70
			System.out.println("점수는 70미만");
			System.out.println("D등급");
		}
	}
}
