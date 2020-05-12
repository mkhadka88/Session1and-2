import java.util.Scanner;

public class JavaIO {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Multiplication of a table.");
		int n = sc.nextInt();
		
		int i = 0;
		
		for (i = 1; i<10; i++) {
			int num = 0;
			
			int p = num *i;
			
			System.out.println(num+ "* " + i +" = "+ p);
			
		}
	}

}
