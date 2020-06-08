package co.edureka;

public class Main {
public static void main(String args[]) throws Exception{
	NumsServiceLocator locator = new NumsServiceLocator();
	Nums obj = locator.getNums();
	System.out.println("Sum= "+obj.addNums(3,5));
	System.out.println("Difference = "+obj.subNums(7f, 4f));
}
}
