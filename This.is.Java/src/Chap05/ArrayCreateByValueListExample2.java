package Chap05;

public class ArrayCreateByValueListExample2 {	//값의 리스트로 배열 생성
	public static void main(String[] args) {
		int[] scores;							//int타입 배열 선언
		scores = new int[] {83,90,87};			//scores에 배열값 저장
		int sum1 = 0;							//sum1 초기화
		for(int i=0; i<scores.length; i++) {	//scores길이 만큼 반복
			sum1 += scores[i];					//sum1에 scores의 값을 더함
		}
		System.out.println(sum1);				//260 출력
		
		int sum2 = add(new int[] {83,90,87});	//sum2에 add메소드의 리턴값을 저장
		System.out.println(sum2);				//260 출력
	}
	public static int add(int[] scores) {		//int타입의 배열을 매개값으로 받아서
		int sum = 0;							//총합을 계산해서 리턴한다
		for(int i=0; i<scores.length; i++) {
			sum += scores[i];
		}
		return sum;								//리턴 타입은 int
	}
}
