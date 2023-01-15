package Chap06;

public class SingletonExample {					//싱글톤 객체

	public static void main(String[] args) {
//		Singleton s1 = new Singleton();			//컴파일 에러
//		Singleton s2 = new Singleton();			//new연산자로 객체 생성 불가능
		Singleton s1 = Singleton.getInstance();	//싱글톤 객체 참조
		Singleton s2 = Singleton.getInstance();
		if(s1==s2) {							//s1과 s2는 같은 객체인가
			System.out.println("같은 싱글톤 객체");	//출력
		}else {
			System.out.println("다른 싱글톤 객체");
		}
	}
}