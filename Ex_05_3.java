import java.util.Scanner;
public class Ex_05_3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("첫번째 원의중심좌표(x1,y1)과 반지름(r1)을 입력하시오:");
		int x1 =input.nextInt();
		int y1 =input.nextInt();
		int r1 =input.nextInt();
		
		System.out.print("두번째 원의중심좌표(x2,y2)과 반지름(r2)을 입력하시오:");
		int x2 =input.nextInt();
		int y2 =input.nextInt();
		int r2 =input.nextInt();
		
		if(r1+r2 > Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2, 2))) {
			System.out.println("--> overlapped");
		}
		else
			System.out.println("--> not overlapped");
	}
}