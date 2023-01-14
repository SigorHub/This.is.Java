package Chap03;

public class CheckOverflowExample {								//산순 연산 전에 오버플로우 탐지
	public static void main(String[] args) {
		try {
			int result = safeAdd(2000000000, 2000000000);		//20억+20억의 연산값을 저장 (40억)
			System.out.println(result);							//연산값 출력
		}catch(ArithmeticException e) {							//ArithmeticException 예외 발생시
			System.out.println("오버플로우 발생 정확한 계산 불가");		//해당 문자열 출력
		}														//ArithmeticException예외가 발생하므로
	}															//오버플로우 발생 정확한 계산 불가 출력
	
	public static int safeAdd(int left, int right) {			//safeAdd메소드는 int타입을 매개값으로
		if(right>0) {											//right > 0 일떄
			if(left>(Integer.MAX_VALUE - right)) {				//왼쪽값이 int의 최대값-오른쪽값 보다 크다면
				throw new ArithmeticException("오버플로우 발생");	//해당 문자열 출력
			}
		}else {													//right <= 0 일떄
			if(left>(Integer.MIN_VALUE - right)) {				//왼쪽값이 int의 최소값-오른쪽값 보다 크다면
				throw new ArithmeticException("오버플로우 발생");	//해당 문자열 출력
			}
		}
		return left + right;									//왼쪽값과 오른쪽값을 더한 값을 리턴
	}
}