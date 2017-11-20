import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		int x = 0, y = 0, z = 0; //변수 선언
		Scanner input = new Scanner(System.in); //입력을 받기위한 함수
		
		try { // 입력한 값을 각각 x, y에 저장한다, 입력시 오류 발생할 수 있으므로 try문 사용
			x = input.nextInt();
			y = input.nextInt();
			z = x * y;
			System.out.printf("%d * %d = %d %n", x, y, z);
		} catch(InputMismatchException e) { // try문에서 x, y에 정수형이 아닌값이 들어가면 아래 내용을 출력
			System.out.println("잘못된 입력입니다.");
		}
	}
}
