package Chap02;

public class FromIntToDouble {
	public static void main(String[] args) {
		int num1 = 123456789;
		int num2 = 123456789;
		double num3 = num2;				//doubleŸ���� ���� 52��Ʈ
		num2 = (int) num3;				//�ս��� �߻����� �ʴ´�.
		int result = num1 - num2;
		System.out.println(result);		//0���
	}
}