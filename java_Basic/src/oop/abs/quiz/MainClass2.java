package oop.abs.quiz;

public class MainClass2 {

	public static void main(String[] args) {
		
		Shape2 r =  new Rect2("정사각형",5);
		
		System.out.println("도형의 이름: " + r.getName());
		System.out.println("도형의 넓이: " + r.getArea());
		
		System.out.println("----------------------------");
		
		Shape2 c = new Circle2("원",4);
		
		System.out.println(c.getName());
		System.out.printf("넓이: %.2f",c.getArea());
		
	}

}
