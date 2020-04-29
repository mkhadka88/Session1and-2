
public class Operators {
public static void main(String args[]) {
	

	double amount = 200.20;
	double discount = 0.2;
	double taxes = 0.18;
	amount = amount - amount * discount;
	
	System.out.println("Amount after 20% discount is:  " + amount);
	
	amount = amount + amount * taxes;
	
	
	System.out.println("Amount after 18% taxes is: "+ amount);
	
	
}
}
