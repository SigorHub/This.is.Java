package Chap05;

public class ArrayCreateByvalueListExample1 {	//값 목록으로 배열 생성
	public static void main(String[] args) {
		int[] score = {83, 90, 87};				//int타입 길이 3배열 생성
		System.out.println(score[0]);			//83출력
		System.out.println(score[1]);			//90출력
		System.out.println(score[2]);			//87출력
		int sum = 0;							//sum 초기화
		for(int i=0; i<score.length; i++) {		//score의 길이 만큼 반복
			sum += score[i];					//sum에 score의 값을 더함
		}
		System.out.println(sum);				//260 출력
		double avg = sum / 3.0;					//sum(260)을 3.0으로 나눈값을 저장
		System.out.println(avg);				//86.66666666666667출력 (double타입)
	}
}