class Outer{
	void show() {
		System.out.println("This is a inner class.");
	}
	class Inner{
		void show() {
			System.out.println("This is a outer class.");
		}
	}
	
	
}
public class NestedorInnerClass {

	public static void main(String[] args) {
		Outer oRef = new Outer();
		oRef.show();
		
		Outer.Inner iRef = oRef.new Inner();
		iRef.show();

	}

}
