package Chap02;

public class VariableScopeExample {
	public static void main(String[] args) {
		int v1 = 15;					//15를 v1의 초기값으로 저장
		if(v1 > 10) {				//v1이 10초과 일때
			int v2 = v1 - 10;		//v1-10의 연산결과를 v2에 저장
		}
//		int v3 = v1 + v2 + 5;		//컴파일 에러발생 변수v2는 로컬변수이기 때문에
	}								//if문의 블록을 벗어나면 메모리에서 없어진다.
}