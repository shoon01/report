
public class Ex03 {
	public static void main(String[] args) {
		BankAccount ba = new BankAccount(-100000); // ���� �ܱ� -100000������ ����
			ba.deposit(100000); // 100000�� �Ա�
			ba.withdraw(100000); // 100000�� ����
			ba.withdraw(500000); // �����ܱ� �̻����� ����� �����߻�
			// TODO Auto-generated catch block
	}
}
