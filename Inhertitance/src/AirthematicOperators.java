import java.util.Scanner;

public class AirthematicOperators {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int s1 = sc.nextInt();
		System.out.println("Enter a second number:");
		int s2 = sc.nextInt();
		int s = s1+s2;
		System.out.println(s1+ " + " +s2 + " = " +s);
		sc.close();
	}
	

}
