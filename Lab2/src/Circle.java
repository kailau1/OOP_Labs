
public class Circle {

	private Vector center;
	private Vector radius;
	
	Circle(Vector center, Vector radius) {
		this.center = center;
		this.radius = radius;
		
	}
	
	public double diameter() {
		double diameter = this.radius.length() * 2;
		return diameter;
		
	}
	
	public double area() {
		double area = Math.PI * this.radius.length();
		return area;
	}
	
	public boolean contains(Vector point) {
	    Vector offset = point.subtract(this.center);

	    boolean containsPoint = offset.length() <= this.radius.length();

	    return containsPoint;
	}

	public Rectangle bounding_box() {
		double cx = this.center.getX();
		double cy = this.center.getY();
		Vector p1 = new Vector(cx - this.radius.length(), cy - this.radius.length());
		Vector p2 = new Vector(cx + this.radius.length(), cy + this.radius.length());
		return new Rectangle(p1, p2);
		
	}
		
		
}

