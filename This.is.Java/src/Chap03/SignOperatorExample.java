package Chap03;

public class SignOperatorExample {
	public static void main(String[] args) {
		int x = -100;					//intŸ�� ������ x�� -100����
		int result1 = +x;
		int result2 = -x;				//-�����ڸ� ��� ��ȣ�ݴ�
		System.out.println(result1);		//-100 ���
		System.out.println(result2);		//100 ���
		
		short s = 100;					//shortŸ�� ������ 100����
//		short result3 = -s;				//������ ���� ��ȣ ����� intŸ���� �ȴ�
		int result3 = -s;				//�������� intŸ�� ������ ����
		System.out.println(result3);		//-100 ���
	}
}