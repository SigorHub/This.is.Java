package Chap03;

public class CompareOperatorExample1 {		//비교 연산자
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		boolean result1 = (num1 == num2);	//10과 20이 같은가?
		System.out.println(result1);		//false 출력
		boolean result2 = (num1 != num2);	//10과 20이 같지 않은가?
		System.out.println(result2);		//true 출력
		boolean result3 = (num1 <= num2);	//10이 20보다 작거나 같은가?
		System.out.println(result3);		//true 출력

		char char1 = 'A';					//유니코드 65
		char char2 = 'B';					//유니코드 66
		boolean result4 = (char1 < char2);	//A가 B보다 작은가?
		System.out.println(result4);		//true 출력
	}
}