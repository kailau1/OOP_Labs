public class Vector {
	double x,y;
	
	
	Vector(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public Vector scale(double factor) {
		Vector scaled_vector = new Vector((this.x * factor), (this.y * factor));
		return scaled_vector;

	}
	
	Vector add(Vector other) {
		Vector add_vector = new Vector(this.x + other.x, this.y + other.y);
		return add_vector;
		
	}
	
	Vector subtract(Vector other) {
		Vector subtract_vector = new Vector(this.x - other.x, this.y - other.y);
		return subtract_vector;
	}
	
	public double length() {
		double r_squared = (this.x * this.x) + (this.y * this.y);
		return Math.sqrt(r_squared);
	}
	
	
	public void print_vector() {
		System.out.printf("Vector x: ", this.x , "Vector y: ", this.y , "Vector length: ", length());
	}
	
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
}

