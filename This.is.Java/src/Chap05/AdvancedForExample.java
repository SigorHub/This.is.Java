package Chap05;

public class AdvancedForExample {				//향상된 for문
	public static void main(String[] args) {
		int[] scores = {95,71,84,93,87};		//int타입 배열에 저장
		int sum = 0;							//sum초기화
		for (int score : scores) {				//score에 scores의값 차례로 저장
			sum += score;						//sum에 score의 값을 차례로 더함
		}
		System.out.println(sum);				//430 출력 (총합)
		
		double avg = (double)sum/scores.length;	//총합을 scores배열의 길이로 나눔
		System.out.println(avg);				//86.0 출력 (평균)
	}
}