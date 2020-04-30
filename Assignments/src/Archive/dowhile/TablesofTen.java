package dowhile;

import java.util.Scanner;

public class TablesofTen {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number");
		
		int x = sc.nextInt();
		int i =1;
		do {
			System.out.println(i + " * " + x + " =  " +i * x);
			i++;
		} while (i < 11);

	}

}
