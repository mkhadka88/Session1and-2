
public class Operatorrevise {
public static void main (String args[]) {
	
	
	double amount = 300.20;
	double discount = 0.2;
	double taxes = .18;
	
	amount = amount - amount * discount;
	
	System.out.println("Amount after 20% discount is:" +amount);
	
	amount = amount + amount * taxes;
	
	
	System.out.println("Amount after 18% taxes is: " +amount);
	
	int customerCount = 0;
	
	customerCount ++;
	customerCount ++;
	customerCount ++;
	customerCount ++;
	
	customerCount --;
	
	
	System.out.println("Customer count in the restaurant is  " + customerCount);
	
	
	
	boolean isGPSEnabled = true;
	
	System.out.println("Is GPS not enabled " + !isGPSEnabled);
	
	
	
	
}
}
