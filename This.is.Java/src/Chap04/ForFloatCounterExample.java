package Chap04;

public class ForFloatCounterExample {		//float타입 카운터 변수
	public static void main(String[] args) {//x의 초기값 0.1이며
		for(float x=0.1f; x<=1.0f; x+=0.1f)	//x가 1.0이될때까지 반복마다 0.1증가
			System.out.println(x);			//x값 출력 (float타입 0.1의 정확한표현 어려움)
	}										//9번째 반복시 x값이 0.9000001이 되기 때문에
}											//10번째는 1.0이 넘어가므로 9번만 반복한다.