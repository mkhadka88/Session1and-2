
abstract class Shape{
	String color;

	public Shape(String color) {
		super();
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public abstract void Shape();
	
}











public class AbcTest {

	public static void main(String[] args) {
		Shape s = new Rectangle("Yellow", 5, 3);
		System.out.println("Color: "+s.getColor());
        s.setColor("Red");
        System.out.println("Color: "+s.getColor());
        s.Shape();
	}

}
