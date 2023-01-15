package Chap06;

public class Computer {			//매개 변수의 수를 모를 경우
	int sum1(int[] values) {	//첫번째 방법 매개값을 배열로 선언한다
		int sum = 0;
		for(int i=0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;				//매개값을 모두 더한 후 리턴시킨다
	}
	int sum2(int...values) {	//두번째 방법 매개값을...형태로 선언한다
		int sum = 0;
		for(int i=0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;				//매개값을 모두 더한 후 리턴
	}
}