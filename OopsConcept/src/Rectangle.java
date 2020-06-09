
 class Rectangle extends Shape{
	 int length, breadth;

	public Rectangle(String color, int len, int bre) {
		super(color);
		this.length = len;
		this. breadth = bre;
	}
	
	public void Shape() {
		System.out.println("Area of Rectangle: "+this.length* this.breadth);
	}

}
