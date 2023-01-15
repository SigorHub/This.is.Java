package Chap06;

public class CarExample5 {						//return문 사용 실행문
	public static void main(String[] args) {
		Car5 car = new Car5();					//Car5객체 생성
		car.setGas(5);							//매개값을 Car5객체의 gas필드에 저장 
		boolean gasState = car.isLeftGas();		//gasState는 gas<=0일떄 false
		if(gasState) {							//gas>0이라면
			System.out.println("출발합니다");
			car.run();							//Car5의 run메소드 호출
		}										//달립니다.+잔량 gas 1씩 감소
		if(car.isLeftGas()) {					//gas>0이라면
			System.out.println("gas 주입 필요없음");
		}else {									//gas<=0이라면
			System.out.println("gas 주입 필요");
		}
	}
}