package Chap02;

public class VariableScopeExample {
	public static void main(String[] args) {
		int v1 = 15;					//15�� v1�� �ʱⰪ���� ����
		if(v1 > 10) {				//v1�� 10�ʰ� �϶�
			int v2 = v1 - 10;		//v1-10�� �������� v2�� ����
		}
//		int v3 = v1 + v2 + 5;		//������ �����߻� ����v2�� ���ú����̱� ������
	}								//if���� ����� ����� �޸𸮿��� ��������.
}