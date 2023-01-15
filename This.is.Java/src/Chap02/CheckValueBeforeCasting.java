package Chap02;

public class CheckValueBeforeCasting {
	public static void main(String[] args) {
		int i = 128;												//int타입 변수i에 128저장
		if(i<Byte.MIN_VALUE || i>Byte.MAX_VALUE) {				//변수i가 byte타입 값의 최소값보다 작거나(or)
			System.out.println("byte 타입으로 변환할 수 없습니다.");	//최대값보다 클 경우에 문자열 출력
			System.out.println("값을 다시 확인해 주세요");				
		}else {													//byte타입 데이터 범위안에 들어올 경우
			byte b = (byte) i;									//byte타입으로 강제 타입 변환후 변수에 저장
			System.out.println(b);								//저장값 출력
		}
	}
}