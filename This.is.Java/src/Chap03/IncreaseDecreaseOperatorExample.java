package Chap03;

public class IncreaseDecreaseOperatorExample {

	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		System.out.println("---------------");
		x++;
		++x;
		System.out.println(x);					//12���
		System.out.println("---------------");
		y--;
		--y;
		System.out.println(y);					//8���
		System.out.println("---------------");
		z = x++;									//z = x ������ ���� �ȴ�
		System.out.println(z);					//12���
		System.out.println(x);					//13��� (x++����)
		System.out.println("---------------");
		z = ++x;									//++x ������ ���� �ȴ�
		System.out.println(z);					//14���
		System.out.println(x);					//14���
		System.out.println("---------------");	//x:14 y:8
		z = ++x + y++;							//14 + 1 + 8�� ���갪�� z������
		System.out.println(z);					//23���
		System.out.println(x);					//15���
		System.out.println(y);					//9��� y++�� ������ ���� �������� �ȴ�
	}
}