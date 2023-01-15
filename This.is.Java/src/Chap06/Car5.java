package Chap06;

public class Car5 {								//return문
	int gas;									//gas필드 선언
	void setGas(int gas) {this.gas=gas;}		//호출시 매개값으로 필드gas초기화
	boolean isLeftGas() {						//논리값을 리턴하는 메소드
		if(gas==0) {							//gas가 0일경우 false 리턴
			System.out.println("gas가 없습니다");
			return false;	}
		System.out.println("gas가 있습니다");		//아닐경우 true 리턴
		return true;	}
	void run() {								//리턴값이 없는 메소드
		while(true) {							//호출시 반복
			if(gas>0) {							//gas>0이면
				System.out.println("달립니다. gas:"+gas);//출력
				gas--;							//gas 1감소
			}else {								//gas<=0이면
				System.out.println("멈춥니다. gas:"+gas);//출력
				return;							//메소드 종료
			}		}	}}