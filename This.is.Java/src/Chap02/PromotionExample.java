package Chap02;

public class PromotionExample {
	public static void main(String[] args) {
		byte byteValue = 10;							//byteŸ�� ������ 10 ����
		int intValue = byteValue;					//byteŸ���� intŸ�� ������ ����
		System.out.println(intValue);				//10 ��� (�ڵ� Ÿ�� ��ȯ)

		char charValue = '��';						//charŸ�� ������ �� ����
		intValue = charValue;						//charŸ���� intŸ�� ������ ����
		System.out.println(+intValue);				//44032 ��� ('��'�� �����ڵ� )

		intValue = 500;								//intŸ�� ������ ���� 500 ����
		long longValue = intValue;					//intŸ���� longŸ�� ������ ����
		System.out.println(longValue);				//500 ��� (�ڵ� Ÿ�� ��ȯ)

		intValue = 200;								//intŸ�� ������ ���� 200 ����
		double doubleValue = intValue;				//intŸ���� doubleŸ�� ������ ����
		System.out.println(doubleValue);				//200.9 ��� (�ڵ� Ÿ�� ��ȯ)
	}												//�������� ������ ūŸ�Կ� ����Ÿ���� �����ϴ� ���
}													//�ڵ� Ÿ�� ��ȯ�� �Ͼ�� (Promotion)