import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		int x = 0, y = 0, z = 0; //���� ����
		Scanner input = new Scanner(System.in); //�Է��� �ޱ����� �Լ�
		
		try { // �Է��� ���� ���� x, y�� �����Ѵ�, �Է½� ���� �߻��� �� �����Ƿ� try�� ���
			x = input.nextInt();
			y = input.nextInt();
			z = x * y;
			System.out.printf("%d * %d = %d %n", x, y, z);
		} catch(InputMismatchException e) { // try������ x, y�� �������� �ƴѰ��� ���� �Ʒ� ������ ���
			System.out.println("�߸��� �Է��Դϴ�.");
		}
	}
}
