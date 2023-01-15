package Chap06;

public class ComputerExample {					//매개 변수의 수를 모를 경우
	public static void main(String[] args) {
		Computer com = new Computer();			//Computer의 객체 생성
		int[] value1 = {1,2,3};
		int result1 = com.sum1(value1);			//sum1메소드의 메개값은 배열형태
		System.out.println(result1);			//6 출력
		
		int result2 = com.sum1(new int[] {1,2,3,4,5});
		System.out.println(result2);			//15 출력
		
		int result3 = com.sum2(1,2,3);			//sum2는 매개값을 ...형태
		System.out.println(result3);			//6 출력
		
		int result4 = com.sum2(1,2,3,4,5);
		System.out.println(result4);			//15 출력
												//메소드도 매개변수로 쓸 수 있다
		int result5 = com.sum2(com.sum1(value1),result2);
		System.out.println(result5);			//48 출력
	}
}