package Chap02;

public class GarbageValueExample {
	public static void main(String[] args) {
		byte var1 = 125;								//byteŸ�� ���� var1
		int var2 = 125;								//intŸ�� ���� var2
		for(int i = 0; i < 5; i++) {					//���๮�� 5�� �ݺ�
			var1++;									//var1 1����
			var2++;									//var2 1����
			System.out.println("var1: "+var1+"\t"+"var2: "+var2);
		}											//var1�� ������ ������ 127�����̱� ������
	}												//127�� �Ѿ�� -128�� �ǰ� +1�� ����ȴ�
}