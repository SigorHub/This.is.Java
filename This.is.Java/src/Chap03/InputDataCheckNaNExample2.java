package Chap03;

public class InputDataCheckNaNExample2 {			//NaN을 체크하고 연산
	public static void main(String[] args) {
		String userInput = "NaN";					//NaN값 저장
		double value = Double.valueOf(userInput);	//double타입으로 변환 후 value에 저장
		double currentBalance = 10000.0;			//10000.0을 저장
		if(Double.isNaN(value)) {					//value의 값이 NaN이라면
			System.out.println("NaN이 입력되어 처리 불가");//해당 문자열 출력이 되고
			value = 0.0;							//value에 0.0 저장된다
		}											//(산술 연산결과가 아닌 리터럴값 0.0을 저장)
		currentBalance += value;					//10000.0 + 0.0의 연산결과를 저장
		System.out.println(currentBalance);			//10000.0 출력
	}
}