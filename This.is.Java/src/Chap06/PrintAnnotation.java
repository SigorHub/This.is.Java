package Chap06;

import java.lang.annotation.*;

@Target({ElementType.METHOD})			//Target은 메소드엠 적용
@Retention(RetentionPolicy.RUNTIME)		//Retention은 런타임시까지 유지
public @interface PrintAnnotation {		//어노테이션 정의
	String value() default "-";			//구분선에 문자열 "-"사용
	int number() default 15;			//반복 출력횟수 15
}