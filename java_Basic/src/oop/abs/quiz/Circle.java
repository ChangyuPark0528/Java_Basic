package oop.abs.quiz;

public class Circle extends Shape {
	
	private int radius;
	
	public Circle() {}

	public Circle(String name, int radius) {
		super(name);
		this.radius = radius;
	}

	@Override
	public double getArea() {
		double area = radius * radius * Math.PI; 
		System.out.printf("%s의 넓이는 %.1f",getName(),area);
		return area;
	}

}
