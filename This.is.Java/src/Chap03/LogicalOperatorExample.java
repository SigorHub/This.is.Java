package Chap03;

public class LogicalOperatorExample {				//논리 연산자
	public static void main(String[] args) {
		int charCode = 'A';
		if((charCode>=65)&(charCode<=90)) {			//AND 논리곱 65~90일떄
			System.out.println("대문자 입니다");		//대문자 입니다 출력
		}
		if((charCode>=97)&&(charCode<=122)) {		//AND 논리곱 97~122일떄
			System.out.println("소문자 입니다");
		}
		if(!(charCode<48)&& !(charCode>57)) {		//NOT논리부정 AND 49~56 일떄
			System.out.println("숫자 입니다");
		}
		int value = 6;
		if((value%2==0)|(value%3==0)) {				//OR논리합 2,3으로 나눈나머지 값이 0일떄
			System.out.println("2 또는 3의 배수 입니다");	//2 또는 3의 배수 입니다 출력
		}
		if((value%2==0)||(value%3==0)) {			//OR논리합
			System.out.println("2 또는 3의 배수 입니다");
		}
	}
}