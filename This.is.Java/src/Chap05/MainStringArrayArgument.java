package Chap05;

public class MainStringArrayArgument {			//메소드의 매개 변수
	public static void main(String[] args) {
		if(args.length != 2) {					//입력 데이터가 2개가 아닐경우
			System.out.println("프로그램의 사용법");	//문자열 출력
			System.out.println("java MainStringArrayArgument num1 num2");
			System.exit(0);						//프로그램 강제 종료
		}
		String str1 = args[0];					//첫번째 데이터를 String타입 변수에 저장
		String str2 = args[1];					//두번째 데이터 저장
		int num1 = Integer.parseInt(str1);		//문자열을 정수로 변환하여 int타입 변수에 저장
		int num2 = Integer.parseInt(str2);
		int result = num1 + num2;				//num1과 num2의 연산결과를 저장
		System.out.println(result);				//출력 (매개값이 10, 10이라면 20)
	}
}