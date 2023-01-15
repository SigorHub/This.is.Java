package Chap02;

public class GarbageValueExample {
	public static void main(String[] args) {
		byte var1 = 125;								//byte타입 변수 var1
		int var2 = 125;								//int타입 변수 var2
		for(int i = 0; i < 5; i++) {					//실행문을 5번 반복
			var1++;									//var1 1증가
			var2++;									//var2 1증가
			System.out.println("var1: "+var1+"\t"+"var2: "+var2);
		}											//var1은 데이터 범위가 127까지이기 때문에
	}												//127을 넘어가면 -128이 되고 +1씩 연산된다
}