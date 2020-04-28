import java.util.Scanner;

public class largestoftwonumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = 30;
		
		int y = 40;
		
		System.out.println("Which number is greater");
		
		x = sc.nextInt();
		
		y = sc.nextInt();
		
		
		if (x>y) {
			System.out.println("x is greater.");
		}
		
		else {
			System.out.println("Y is greater.");
		}

	}

}
