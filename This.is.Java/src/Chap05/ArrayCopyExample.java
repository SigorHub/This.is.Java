package Chap05;

public class ArrayCopyExample {							//arraycopy로 복사
	public static void main(String[] args) {
		String[] oldArray = {"java", "array", "copy"};	//String타입 배열에 문자열 저장
		String[] newArray = new String[5];				//String타입의 길이5 배열생

		//oldArray의 index 0번부터 newArray의 index의 0번에 oldArray의 길이만큼 복사
		System.arraycopy(oldArray, 0, newArray, 0, oldArray.length);
		for(int i=0; i<newArray.length; i++) {			//newArray의 길이만큼 반복
			System.out.println(newArray[i]);			//java,array,copy,null,null출력
		}												//복사되지 않은 항목은 초기값(null)유지
	}
}