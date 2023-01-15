package Chap05;

public class ArrayCopyByForExample {			//for문으로 배열 복사
	public static void main(String[] args) {
		int[] oldIntArray = {1,2,3};			//int타입 배열에 1,2,3저장
		int[] newIntArray = new int[5];			//int타입 길이5 배열생성
		for(int i=0; i<oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i];	//oldIntArray의값을 복사
		}
		for(int i=0; i<newIntArray.length; i++) {
		System.out.println(newIntArray[i]);		//1,2,3,0,0 출력
		}										//복사되지 않은 값은 초기값(0)유지
	}
}