import java.util.LinkedList;

public class PrimeNumber03 implements Runnable {
	private int number; // 변수 선언
	private String name;
	LinkedList<Integer> prime = new LinkedList<>();
	
	public PrimeNumber03(int number, String name) { // 생성자 출력
		this.number = number;
		this.name = name;
	}
	
	@Override
	public void run() {
		System.out.println(this.name + ":");
		int j;
		for(int i = 2; i <= this.number; i++) {
			for(j = 2; j < i; j++) {
				if(i % j == 0)
					break;
			}
			if(j == i)
				prime.add((Integer)j);
		}
		System.out.println(prime.toString());
		prime.clear();
	}
}
