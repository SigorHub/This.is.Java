package Chap03;

public class AccuracyExample2 {						//정확하게 계산할때는 부동소수점 타입 사용금지 
	public static void main(String[] args) {
		int apple = 1;
		int totalPieces = apple * 10;				//소수점 계산이 아닌 정수타입으로 계산
		int number = 7;
		int temp = totalPieces - number;
		double result = temp/10.0;					//10을 곱하고 다시 10을 나눈 후 double타입 저장
		System.out.println(result);					//0.3 출력
	}
}