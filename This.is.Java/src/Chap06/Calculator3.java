package Chap06;

public class Calculator3 {					//메소드 오버로딩
	double areaRectangle(double width) {	//정사각형 넓이 리턴
		return width * width;
	}
	double areaRectangle(double width, double height) {
		return width * height;				//직사각형 넓이 리턴
	}
}