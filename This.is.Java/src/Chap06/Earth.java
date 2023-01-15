package Chap06;

public class Earth {						//상수 선언
	static final double EARTH_RADIUS = 6400;//상수 초기화
	static final double EARTH_AREA;			//상수 선언
	static {								//정적 블록에서 상수 초기화
		EARTH_AREA = 4*Math.PI*EARTH_RADIUS*EARTH_RADIUS;
	}
}
