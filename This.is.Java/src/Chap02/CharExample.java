package Chap02;

public class CharExample {
	public static void main(String[] args) {
		char c1 = 'A';					//A�� ���� ����
		char c2 = 65;					//A�� 10������ ����
		char c3 = '\u0041';				//A�� 16������ ����
		char c4 = '��';					//���� ���� ����
		char c5 = 44032;					//���� 10������ ����
		char c6 = '\uac00';				//���� 16������ ����
		int uniCode = c1;				//A�� �����ڵ� ���
		
		System.out.println(c1);			//A���
		System.out.println(c2);			//A���
		System.out.println(c3);			//A���
		System.out.println(c4);			//�����
		System.out.println(c5);			//�����
		System.out.println(c6);			//�����
		System.out.println(uniCode);		//65���
	}
}