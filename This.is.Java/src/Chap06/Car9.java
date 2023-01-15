package Chap06;

public class Car9 {							//Getter와 Setter 메소드 선언
	private int speed;						//private 필드 선언
	private boolean stop;
	public int getSpeed() {return speed;}	//호출시 speed필드값 리턴
	public void setSpeed(int speed) {		//호출시 매개값이
		if(speed<0) {						//0보다 작다면 speed에 0저장
			this.speed = 0;
			return;							//메소드 종료
		}else {
			this.speed = speed;				//0보다 크다면 speed필드값에 매개값저장
		}
	}
	public boolean isStop() {return stop;}	//호출시 stop필드값 리턴
	public void setStop(boolean stop) {		//호출시 매개값을
		this.stop = stop;					//필드에 저장
		this.speed = 0;						//spped필드에 0저장
	}
}