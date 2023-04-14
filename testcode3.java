//섭씨 온도와 화씨온도 변환
import java.util.Scanner;
public class testcode3{
	public static void main(String[] agrs) {
		Scanner in = new Scanner(System.in);
		System.out.println("섭씨온도(Tc)를 화씨온도(Tf)로 변환시 1\n화씨온도(Tf)를 섭씨 온도(Tc)로 변환시 2\n");
		int ch= in.nextInt();
		if (ch == 1) {
			System.out.print("섭씨온도(Tc): ");
			double Tc= in.nextDouble();
			System.out.printf("화씨 온도(Tf): %5.2f",9*Tc/5+32);
		}
		else if (ch ==2 ) {
			System.out.print("화씨온도(Tf): ");
			double Tf= in.nextDouble();
			System.out.printf("섭씨 온도(Tc): %5.2f",5*(Tf-32)/9);
		}
		else {
			System.out.println("잘못된 입력");
		}
		in.close();
		
	}
}