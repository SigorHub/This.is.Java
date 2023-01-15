package Chap06;

public class CarExample7 {					//인스턴스 멤버와 this
	public static void main(String[] args) {
		Car7 myCar = new Car7("꼬마자동차");	//Car7객체생성
		Car7 yourCar = new Car7("녹차");		//Car7객체생성
		
		myCar.run();						//꼬마자동차10~50까지 5번 출력
		yourCar.run();						//녹차10~50까지 5번 출력
	}
}