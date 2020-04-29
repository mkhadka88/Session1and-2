
public class Conditionalflows {

	public static void main(String[] args) {
		
		int promoCode = 1001;
		
		double amount  =380.0;
		
		if ( amount >= 200) {
			
			System.out.println("You are eligible for 20% promo code.");
			System.out.println("Use promo code 1001 to get the discount");
		}
		else {
			System.out.println("Please pay the full price " + amount);
		}
		
		if ( amount >= 200) {
			
			if(promoCode == 1001) {
				amount = amount - amount * 0.2;
				
				System.out.println("Promo code sucessfully applied. Please the amount of: "+ amount);
			
			}
			
			
		           else {
			
				
				         System.out.println("Please use promo code 1001 to get 20% discount.");
			           }
			
		}else {
				
				System.out.println("Please pay full amount of: "+ amount);
			}
			
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


