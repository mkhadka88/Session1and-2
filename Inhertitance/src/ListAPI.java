import java.util.ArrayList;
import java.util.Iterator;

class Product{
	int aip;
	String name;
	int price;
	
Product(){
	
}

public Product(int aip, String name, int price) {
	super();
	this.aip = aip;
	this.name = name;
	this.price = price;
}
public String toString() {
	return aip+ ", "+name+", "+price;
}
}

public class ListAPI{
	public static void main(String args[]) {
		ArrayList list1 = new ArrayList();
		ArrayList<String> list2 = new ArrayList<String>();
		ArrayList<Product> cart = new ArrayList<Product>();
		Product p1 = new Product(101, "Iphone", 750);
		Product p2 = new Product (201, "Adidas", 130);
		Product p3 = new Product (301, "Samsung", 950);
		
		list1.add("John");
		list1.add("Fionna");
		list1.add('A');
		list1.add(2.2);
		
		list2.add("Ram");
		list2.add("Gopal");
		list2.add("Hari");
		list2.add("Ravi");
		
		cart.add(p1);
		cart.add(p2);
		cart.add(p3);
		
		System.out.println("List1:");
		System.out.println(list1);
		System.out.println();
		
		System.out.println("List2:");
		System.out.println(list2);
		System.out.println();
		
		System.out.println("Shopping cart:");
		System.out.println(cart);
		
		System.out.println(list1.size());
		System.out.println(list1.get(2));
		System.out.println(list1.contains("Ram"));
		
		Iterator iRef = list1.iterator();
		System.out.println(iRef.next());
		System.out.println(iRef.next());
		
		list2.clear();
		System.out.println(list2);
		
		
		
		
		
		
		
		
		
		
	}
}