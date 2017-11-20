
public class Ex03 {
	public static void main(String[] args) {
		BankAccount ba = new BankAccount(-100000); // 최저 잔금 -100000원으로 설정
			ba.deposit(100000); // 100000원 입금
			ba.withdraw(100000); // 100000원 인출
			ba.withdraw(500000); // 최저잔금 이상으로 인출시 오류발생
			// TODO Auto-generated catch block
	}
}
