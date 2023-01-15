package Chap06;

import java.lang.reflect.Method;

public class PrintAnnotationExample {
	public static void main(String[] args) {
		Method[] declaredMethods = Service.class.getDeclaredMethods();	//Service클래스에 선언된 메소드 얻기
		for(Method method : declaredMethods) {							//메소드 객체를 하나씩 method변수에 저장
			if(method.isAnnotationPresent(PrintAnnotation.class)) {		//어노테이션이 적용되었는지 확인
				PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);
				
				System.out.println(method.getName());					//메소드 이름 출력
				for(int i=0; i<printAnnotation.number(); i++) {			//구분선 출력
					System.out.print(printAnnotation.value());			//메소드 값 (실행 내용) 출력
				}
				System.out.println();
			}
			try {
				method.invoke(new Service());							//메소드 호출
			}catch(Exception e) {}										//예외처리
			System.out.println();
		}
	}
}