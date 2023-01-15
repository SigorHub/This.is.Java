package Chap03;

public class IncreaseDecreaseOperatorExample {

	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		System.out.println("---------------");
		x++;
		++x;
		System.out.println(x);					//12출력
		System.out.println("---------------");
		y--;
		--y;
		System.out.println(y);					//8출력
		System.out.println("---------------");
		z = x++;									//z = x 연산이 먼저 된다
		System.out.println(z);					//12출력
		System.out.println(x);					//13출력 (x++연산)
		System.out.println("---------------");
		z = ++x;									//++x 연산이 먼저 된다
		System.out.println(z);					//14출력
		System.out.println(x);					//14출력
		System.out.println("---------------");	//x:14 y:8
		z = ++x + y++;							//14 + 1 + 8의 연산값을 z에저장
		System.out.println(z);					//23출력
		System.out.println(x);					//15출력
		System.out.println(y);					//9출력 y++의 연산이 가장 마지막에 된다
	}
}