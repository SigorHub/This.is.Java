package Chap03;

public class AssignmentOperatorExample {	//대입 연산자
	public static void main(String[] args) {
		int result = 0;						//대입 연산자를 풀어서 쓰면
		result += 10;						//result = result + 10
		System.out.println(result);			//10 출력
		result -= 5;						//result = result - 5
		System.out.println(result);			//5 출력
		result *= 3;						//result = result * 3
		System.out.println(result);			//15 출력
		result /= 5;						//result = result / 5
		System.out.println(result);			//3 출력
		result %= 3;						//result = result % 3
		System.out.println(result);			//0 출력
	}
}