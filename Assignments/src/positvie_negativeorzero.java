import java.util.Scanner;

public class positvie_negativeorzero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Give me a number:");
		
		int i = sc.nextInt();
		
		if(i >0) {
			System.out.println("Number is positive.");
		}
		
		else if(i<0)
		{
			System.out.println("NUmber is negative");
		}
		
		else {
			System.out.println("Number is zero");
		}
		
		
		
		
	}

}
