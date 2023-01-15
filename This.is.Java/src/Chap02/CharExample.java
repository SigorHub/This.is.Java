package Chap02;

public class CharExample {
	public static void main(String[] args) {
		char c1 = 'A';					//A를 직접 저장
		char c2 = 65;					//A를 10진수로 저장
		char c3 = '\u0041';				//A를 16진수로 저장
		char c4 = '가';					//가를 직접 저장
		char c5 = 44032;					//가를 10진수로 저장
		char c6 = '\uac00';				//가를 16진수로 저장
		int uniCode = c1;				//A의 유니코드 얻기
		
		System.out.println(c1);			//A출력
		System.out.println(c2);			//A출력
		System.out.println(c3);			//A출력
		System.out.println(c4);			//가출력
		System.out.println(c5);			//가출력
		System.out.println(c6);			//가출력
		System.out.println(uniCode);		//65출력
	}
}