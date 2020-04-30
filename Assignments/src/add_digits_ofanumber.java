import java.util.Scanner;

public class add_digits_ofanumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number");
		int x = sc.nextInt();
		int rem, sum = 0;
		
		
		for(;x>0; x = x/10) {
			
			rem = x % 10;
			sum = sum + rem;
			
		}
		System.out.println("Added number of digit " + sum);

	}

}
