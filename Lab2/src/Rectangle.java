
public class Rectangle {
	
	private Vector v1;
	private Vector v2;

	Rectangle(Vector v1, Vector v2) {
		this.v1 = new Vector(4, 10);
		this.v2 = new Vector(6, 12);
	}

	
	public double getWidth() {
		double width = this.v2.getX() - this.v1.getX();
		return width;
	}
	
	public double getHeight() {
		double height = this.v2.getY() - this.v1.getY();
		return height;
	}
	
	public double getArea() {
		double area = getWidth() * getHeight();
		return area;
		
	}
	
	public Vector getCenter() {
		Vector center = this.v1.add(this.v2).scale(0.5);
		return center;
	}
	
	public void print_rectangle() {
		System.out.println("Vector v1: ");
		this.v1.print_vector();
		System.out.println("Vector v2: ");
		this.v2.print_vector();
	}
	
	public boolean contains(Vector point) {
	    boolean contains = this.v1.getX() <= point.getX() && point.getX() <= this.v2.getX() &&
	                       this.v1.getY() <= point.getY() && point.getY() <= this.v2.getY();

	    return contains;
	}

				
}
	

