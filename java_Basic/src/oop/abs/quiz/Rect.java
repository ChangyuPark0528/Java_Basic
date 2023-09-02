package oop.abs.quiz;

public class Rect extends Shape {
	
	int line;
	int hight;
	
	public Rect() {}
	
	public Rect(String name, int line, int hight) {
		super(name);
		this.line = line;
		this.hight = hight;
	}

	@Override
	public double getArea() {
		double area = line*hight;
		System.out.printf("%s의 넓이는 %.1f",getName(),area);
		return area;
		
	}


}
