package Chap03;

public class InfinityAndNaNCheckExample {			//Infinity와 NaN

	public static void main(String[] args) {
		int x = 5;
		double y = 0.0;
		double z = x / y;							//5 나누기 0.0 (무한대)
		double z2 = x % y;							//5를 0.0으로 나눈 나머지값 (값이 없음)
		
		System.out.println(Double.isInfinite(z));	//true 출력 (z의 값은 무한인가?)
		System.out.println(Double.isNaN(z));		//false 출력 (z의 값은 없는가?)
		System.out.println(z+1);					//Infinity 출력
		System.out.println(Double.isInfinite(z2));	//false 출력 (z2의 값은 무한인가?)
		System.out.println(Double.isNaN(z2));		//true 출력  (z2의 값은 없는가?)
		System.out.println(z2+1);					//NaN 출력
	}
}