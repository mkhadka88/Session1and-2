

class hase{
	int a = 10, b= 20;
	
	void display() {
		System.out.println("Inside base class.");
	}

}
public class OverridingMethods {
public static void main(String args[]) {
	
	derive obj = new derive();
	System.out.println(obj.a+ "||"+obj.b);
	obj.display();
}
}
