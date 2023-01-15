package Chap02;

public class FloatDoubleExample {
	public static void main(String[] args) {
		double var1 = 3.14;
//		float var2 = 3.14;						//������ ����
		float var3 = 3.14F;						//int�� ������ ������ �Ǽ��� ���� ������
												//���ͷ����� F�� �ٿ����Ѵ�
		double var4 = 0.1234567890123456789;
		float var5 = 0.1234567890123456789F;
		
		System.out.println(var1);				//3.14 ���
//		System.out.println(var2);
		System.out.println(var3);				//3.14 ���
		System.out.println(var4);				//0.12345678901234568 ���
		System.out.println(var5);				//0.12345679 ���
		
		int var6 = 3000000;
		double var7 = 3e6;						//e6�� 10�� 6���̴�
		float var8 = 3e6F;
		double var9 = 2e-3;						//e-3�� 10�� -3���̴�
		
		System.out.println(var6);				//3000000 ���
		System.out.println(var7);				//3000000.0 ���
		System.out.println(var8);				//3000000.0 ���
		System.out.println(var9);				//0.002 ���
	}
}
