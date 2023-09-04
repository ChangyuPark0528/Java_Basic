package oop.abs.quiz;

public abstract class Shape2 {
	
	String name;
	
	public Shape2(String name) {
		this.name = name;
	}
	
	public abstract double getArea();
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	

}
