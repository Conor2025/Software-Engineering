public class Circle {
	private double radius;
	
	public Circle() {
	}
	public Circle(double newRadius) {
		this.radius = newRadius;
	}
	public double getArea() {
		return Math.PI * (radius * radius);
	}
	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}
	public void setRadius(double newRadius) {
		this.radius = newRadius;
	}
	public double getRadius() {
		return radius;
	}

}
