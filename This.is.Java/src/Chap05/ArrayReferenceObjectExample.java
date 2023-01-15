package Chap05;

public class ArrayReferenceObjectExample {				//객체를 참조하는 배열
	public static void main(String[] args) {			//길이3의 배열 생성
		String[] strArray = {"Java","Java",new String("Java")};
		System.out.println(strArray[0]==strArray[1]);	//true
		System.out.println(strArray[0]==strArray[2]);	//false
		System.out.println(strArray[0].equals(strArray[2]));//true
	}													//문자열은 equals로 비교
}
