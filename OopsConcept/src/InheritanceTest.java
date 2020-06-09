

class Base{
	int a = 10, b = 20;
	void methodA() {
		System.out.println("Inside base class.");
	}

	


	
}
public class InheritanceTest {

	public static void main(String[] args) {
		Derived obj = new Derived();
		System.out.println(obj.a+ "|| "+obj.b+" || "+obj.c+"|| "+obj.d);
		
		obj.methodA();
		obj.methodB();

	}

}
