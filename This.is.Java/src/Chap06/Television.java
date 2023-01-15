package Chap06;

public class Television {				//정적 초기화 블록
	static String company = "Samsung";	//정적필드 초기화
	static String model = "LCD";
	static String info;					//정적필드 선언
	static {							//정적블록
		info = company+"-"+model;		//info필드 초기화
	}
}