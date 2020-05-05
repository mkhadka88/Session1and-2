class Dish{
	int quantity;
	static int count;
	
	Dish(){
		quantity = 1;
		count =1;
	}
	void increament() {
		quantity ++;
		count++;
	}
	void desreament() {
		quantity --;
		count--;
	}
	
	void showQuantity() {
		System.out.println("Quantity "+ quantity + " Count: "+count);
	}
	
	
}

public class OOPSquiz {
public static void main(String args[]) {
	
	Dish dish1= new Dish();
	Dish dish2 = new Dish();
	Dish dish3 = dish1;
	
	dish1.increament();
	dish2.increament();
	dish3.increament();
	
	dish1.increament();
	dish2.increament();
	
	
	dish1.desreament();
	dish2.increament();
	dish3.desreament();

	
	dish1.showQuantity();
	dish2.showQuantity();
	dish3.showQuantity();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
