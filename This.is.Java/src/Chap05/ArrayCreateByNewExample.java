package Chap05;

public class ArrayCreateByNewExample {		//new 연산자로 배열 생성
	public static void main(String[] args) {
		int[] arr1 = new int[3];			//int타입 길이3의 배열생성
		for(int i=0; i<arr1.length; i++) {	//배열의 길이만큼 반복
			System.out.println(arr1[i]);	//0, 0, 0 출력
		}
		arr1[0] = 10;						//arr1의 index 0번~2번까지 값저장
		arr1[1] = 20;
		arr1[2] = 30;
		for(int i=0; i<arr1.length; i++) {
			System.out.println(arr1[i]);	//10, 20, 30을 출력
		}
		double[] arr2 = new double[3];		//double타입 길이3의 배열생성
		for(int i=0; i<arr2.length; i++) {
			System.out.println(arr2[i]);	//0.0, 0.0, 0.0 출력
		}
		arr2[0] = 0.1;
		arr2[1] = 0.2;
		arr2[2] = 0.3;
		for(int i=0; i<arr2.length; i++) {
			System.out.println(arr2[i]);	//0.1, 0.2, 0.3 출력
		}
		String[] arr3 = new String[3];		//String타입 길이3의 배열생성
		for(int i=0; i<arr3.length; i++) {
			System.out.println(arr3[i]);	//null, null, null 출력
		}
		arr3[0]	= "1월";
		arr3[1]	= "2월";
		arr3[2]	= "3월";
		for(int i=0; i<arr3.length; i++) {
			System.out.println(arr3[i]);	//1월, 2월, 3월 출력
		}
	}
}