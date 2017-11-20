public class BankAccount {
	private int minRepository; //�����ݾ�
	private int repository; // �ܾ�

	public BankAccount() {
		minRepository = 0; // ���� �ݾ��� 0���� �����ϴ� ������
	}

	public BankAccount(int min) {
		minRepository = min; //���� �ݾ��� �����ϴ� ������
	}

	public void deposit(int money) { // �Ա��� ó���ϴ� �޼ҵ�
		repository += money;
		System.out.println("���� �Ա�ó��: �Աݱݾ�=" + money + ", �ܱ�=" + repository);
	}

	public int withdraw(int money) throws InvalidWithdraw { // 
		if (money <= 0)
			throw new InvalidWithdraw("���� �ݾ��Դϴ�."); // ���� ���� �Է��� �� 
		else if (repository - money < minRepository)
			throw new InvalidWithdraw("���� �ܱ��� �Ѿ�� ����Դϴ�."); // ���� �ܱݺ��� �� ���� ������ ��
		else {
			repository -= money; // ���������� ó���� ���
			System.out.println("���� ���ó��: ����ݾ�=" + money + ", �ܱ�=" + repository);
			return minRepository;
		}
	}
}
