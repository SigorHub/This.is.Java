package Chap02;

public class OperationsPromotionExample {
	public static void main(String[] args) {
		byte byteValue1 = 10;
		byte byteValue2 = 20;
//		byte byteValue3 = byteValue1 + byteValue2;	//������ ���� �������� intŸ��
		int intValue = byteValue1 + byteValue2;		//byteŸ�Կ� ���� �� �� ����
		System.out.println(intValue);				//30 ���
		
		char charValue1 = 'A';
		char charValue2 = 1;
//		char charValue3 = charValue1 + charValue2;	//������ ���� �������� intŸ��
		intValue = charValue1 + charValue2;			//charŸ�Կ� ������ �� ����
		System.out.println(intValue);				//66 ���
		
		int intValue1 = 10;						
		intValue = intValue1/4;						//intŸ���� ������ ����� �Ҽ����� ����
		System.out.println(intValue);				//2 ���
		
		int intValue2 = 10;
//		int intValue3 = 10 / 4.0;					//������ ���� �������� doubleŸ��
		double doubleValue = 10 / 4.0;				//4.0�� �Ǽ��� ��� double�� �ڵ�Ÿ�Ժ�ȯ 
		System.out.println(doubleValue);				//2.5 ���
	}
}