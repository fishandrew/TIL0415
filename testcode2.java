// 진수 변환
import java.util.Scanner;
public class testcode2{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("enter the first number: ");
		int num1 = input.nextInt();
		System.out.print("enter the second number: ");
		int num2 = input.nextInt();
		int sum = num1 + num2;

		System.out.printf("합계 10진수 : %d, 8진수: %o, 16진수: %x",sum, sum, sum);
		input.close();
		}
}

// 14 1110