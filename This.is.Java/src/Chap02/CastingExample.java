package Chap02;

public class CastingExample {

	public static void main(String[] args) {
		int intValue = 44032;					//intŸ�� ������ 44032����
		char charValue = (char) intValue;		//charŸ������ ���� Ÿ�� ��ȯ
		System.out.println(charValue);			//�� ���
		
		long longValue = 500;					//longŸ�� ������ 500����
		intValue = (int) longValue;				//intŸ������ ���� Ÿ�� ��ȯ
		System.out.println(intValue);			//500 ���
		
		double doubleValue = 3.14;				//doubleŸ�� ������ 3.14����
		intValue = (int) doubleValue;			//intŸ������ ���� Ÿ�� ��ȯ
		System.out.println(intValue);			//3���
	}											//intŸ���� ������ ������ �����̱� ������
}												//�Ǽ� �κ��� ������ �ս��� �߻��Ѵ� (Casting)