package Chap02;

public class CheckValueBeforeCasting {
	public static void main(String[] args) {
		int i = 128;												//intŸ�� ����i�� 128����
		if(i<Byte.MIN_VALUE || i>Byte.MAX_VALUE) {				//����i�� byteŸ�� ���� �ּҰ����� �۰ų�(or)
			System.out.println("byte Ÿ������ ��ȯ�� �� �����ϴ�.");	//�ִ밪���� Ŭ ��쿡 ���ڿ� ���
			System.out.println("���� �ٽ� Ȯ���� �ּ���");				
		}else {													//byteŸ�� ������ �����ȿ� ���� ���
			byte b = (byte) i;									//byteŸ������ ���� Ÿ�� ��ȯ�� ������ ����
			System.out.println(b);								//���尪 ���
		}
	}
}