package Chap05;

public class EnumMethodExample {			//열거 객체의 메소드
	public static void main(String[] args) {
		Week today = Week.SUNDAY;			//Week타입의 변수 today는 SUNDAY참조
		String name = today.name();			//today의 문자열을 String타입으로 저장
		System.out.println(name);			//SUNDAY 출력
		
		int ordinal = today.ordinal();		//today의 순번을 초기값으로 선언
		System.out.println(ordinal);		//6 출력 (Week의 index 6번)
		
		Week day1 = Week.MONDAY;			//Week타입의 변수 day1는 MONDAY참조
		Week day2 = Week.WEDNESDAY;			//Week타입의 변수 day2는 WEDNESDAY참조
		int result1 = day1.compareTo(day2);	//day1의 순번이 day2보다 2만큼 빠르다
		System.out.println(result1);		//-2 출력
		int result2 = day2.compareTo(day1);	//day2의 순번이 day1보다 2만큼 늦다
		System.out.println(result2);		//2 출력
		
		if(args.length==1) {				//args의 길이가 1이라면
			String strDay = args[0];		//String 타입으로 저장
			Week weekDay = Week.valueOf(strDay);//strDay와 같은 문자열 리턴하여 저장
			if(weekDay==Week.SATURDAY||weekDay==Week.SUNDAY) {	//토,일인 경우
				System.out.println("주말");	//출력
			}else {
				System.out.println("평일");	//토,일이 아니면 출력
			}
		}
		Week[] days = Week.values();		//Week의 모든 열거 객체를 배열로 리턴하여 저장
		for(Week day : days) {				//변수에 days의 값을 차레대로 저장
			System.out.println(day);		//MONDAY~SUNDAY까지 전부 출력 (7번)
		}
	}
}
