package Chap02;

public class FromIntToFloat {
	public static void main(String[] args) {
		int num1 = 123456789;			//intŸ�� ������ ���� (27��Ʈ ������)
		int num2 = 123456789;			//floatŸ���� �ε��Ҽ��� ��Ļ�� ���� 23��Ʈ
		float num3 = num2;				//�����Ͱ� 23��Ʈ�� �Ѿ ���е� �սǹ߻� 
		num2 = (int) num3;				//����Ÿ�Ժ�ȯ �� ���� (123456792)
		int result = num1 - num2;		//���� ����� ������ ����
		System.out.println(result);		//-3 ���
	}
}