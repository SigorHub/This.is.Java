package Chap04;

public class IfNestedExample {					//중첩 if문
	public static void main(String[] args) {
		int score = (int)(Math.random()*20)+81;	//80~100의 난수 저장
		System.out.println("점수: "+score);		//점수 출력
		String grade;
		if(score>=90) {
			if(score>=95) {						//중첩if문
				grade = "A+";					//95<=score	A+
			}else {
				grade = "A";					//90<=score	A
			}
		}else {									//score<90	B+,B
			if(score>=85) {
				grade = "B+";					//85<=score	B+
			}else {
				grade = "B";					//score<85	B
			}
		}
		System.out.println("학점: "+grade);		//학점 출력
	}
}