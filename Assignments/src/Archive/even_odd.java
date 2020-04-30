import java.util.Scanner;

public class even_odd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i = 50;
		 System.out.println("Enter a number:");
		 
		 i = sc.nextInt();
		 
		 if (i % 2==0) {
			 System.out.println("Enter number is even");
		 }
		 else {
			 System.out.println("Enter number is odd.");
		 }

	}

}
