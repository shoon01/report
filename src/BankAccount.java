public class BankAccount {
	private int minRepository; //최저금액
	private int repository; // 잔액

	public BankAccount() {
		minRepository = 0; // 최저 금액을 0으로 설정하는 생성자
	}

	public BankAccount(int min) {
		minRepository = min; //최저 금액을 설정하는 생성자
	}

	public void deposit(int money) { // 입금을 처리하는 메소드
		repository += money;
		System.out.println("정상 입금처리: 입금금액=" + money + ", 잔금=" + repository);
	}

	public int withdraw(int money) throws InvalidWithdraw { // 
		if (money <= 0)
			throw new InvalidWithdraw("음수 금액입니다."); // 음수 값을 입력할 시 
		else if (repository - money < minRepository)
			throw new InvalidWithdraw("최저 잔금을 넘어서는 출금입니다."); // 최저 잔금보다 더 많이 인출할 시
		else {
			repository -= money; // 정상적으로 처리될 경우
			System.out.println("정상 출금처리: 인출금액=" + money + ", 잔금=" + repository);
			return minRepository;
		}
	}
}
