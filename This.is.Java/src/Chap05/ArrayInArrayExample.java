package Chap05;

public class ArrayInArrayExample {						//배열 속의 배열
	public static void main(String[] args) {
		int[][] mathScores = new int[2][3];				//길이2배열 생성 각배열에 길이3의 배열생성
		for(int i=0; i<mathScores.length; i++) {		//mathScores길이만큼 반복
			for(int k=0; k<mathScores[i].length; k++) {	//mathScores의 i번째 배열 길이만큼 반복
				System.out.println(mathScores[i][k]);	//0 6번 출력
			}
		}
		int[][] englishScores = new int[2][];			//길이2배열 생성
		englishScores[0] = new int[2];					//index0번에 길이2배열 생성
		englishScores[1] = new int[3];					//index1번에 길이3배열 생성
		for(int i=0; i<englishScores.length; i++) {
			for(int k=0; k<englishScores[i].length; k++) {
				System.out.println(englishScores[i][k]);//0 5번 출력
			}
		}												//향상된 for문 사용
		int[][] javaScores = {{95,84},{65,86,98}};		//길이2배열 생성 각배열에 {95,84}
		for(int[] i : javaScores) {						//{65,86,98}이 각각 저장된다
			for(int k : i)System.out.println(k);		//95,84,65,86,98 출력
		}
	}
}
