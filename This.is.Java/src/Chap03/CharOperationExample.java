package Chap03;

public class CharOperationExample {	//char 타입 연산
	public static void main(String[] args) {
		char c1 = 'A' + 1;			//A는 유니코드65
		char c2 = 'A';
//		char c3 = c2 + 1;			//컴파일 에러 +연산시 int타입으로 변환
		System.out.println(c1);		//B출력 (유니코드66)
		System.out.println(c2);		//A출력
//		System.out.println(c3);
	}
}
