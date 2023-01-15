package Chap05;

import java.util.Calendar;							//Calendar클래스 사용시 import

public class EnumWeekExample {						//열거 타입과 열거 상수
	public static void main(String[] args) {
		Week today = null;							//열거타입 변수선언
		Calendar cal = Calendar.getInstance();		//Calendar객체 생성
		int week = cal.get(Calendar.DAY_OF_WEEK);	//일~토(1~7)숫자 리턴값을 저장
		
		switch(week) {								//week에 저장된 값이 조건식
		case 1:
			today = Week.SUNDAY; break;				//변수에 열거상수 저장
		case 2:
			today = Week.MONDAY; break;
		case 3:
			today = Week.TUESDAY; break;
		case 4:
			today = Week.WEDNESDAY; break;
		case 5:
			today = Week.THURSDAY; break;
		case 6:
			today = Week.FRIDAY; break;
		case 7:
			today = Week.SATURDAY; break;
		}
		System.out.println(today);					//SUNDAY 출력 (오늘은 일요일)
		if(today==Week.SUNDAY) {					//today에 저장된 값이 일요일이라면
			System.out.println("일요일에는 축구를 합니다");	//일요일에는 축구를 합시다 출력
		}else {
			System.out.println("열심히 자바 공부를 합니다");
		}
	}
}