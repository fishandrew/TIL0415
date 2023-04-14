import java.util.Scanner;
public class testcode4{
	public static void main(String[] agrs) {
		Scanner in = new Scanner(System.in);
		System.out.print("Amount: ");
		int m= in.nextInt();
		
		System.out.printf("50,000: %d\n", m/50000);
		System.out.printf("10000: %d\n", (m%50000)/10000);
		System.out.printf("5000: %d\n", (m%10000)/5000);
		System.out.printf("1000: %d\n", (m%5000)/1000);
		System.out.printf("500: %d\n", (m%1000)/500);
		System.out.printf("100: %d\n", (m%500)/100);
		System.out.printf("50: %d\n", (m%100)/50);
		System.out.printf("10: %d\n", (m%50)/10);
		in.close();
	}
}