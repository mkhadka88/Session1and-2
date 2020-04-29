
public class Logicaloperators {

	public static void main(String[] args) {
	
		double totalBillAmount = 600;
		
		System.out.println("Can we offer 30% discount: "+ (totalBillAmount > 200  && totalBillAmount <= 500 ));
        
		
		System.out.println("Can we offer 20 % discount  "+ (totalBillAmount >200 && totalBillAmount < 600));
	    
		
		boolean primeCustomer = true;
		 System.out.println("We are going to give 30% discount: " + (totalBillAmount >= 500 || primeCustomer));
	
	
	
	
	
	
	
	
	
	
	}

}
