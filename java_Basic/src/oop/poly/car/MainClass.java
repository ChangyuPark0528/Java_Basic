package oop.poly.car;

public class MainClass {

	public static void main(String[] args) {
		
		Sonata s1 = new Sonata();
		Sonata s2 = new Sonata();
		Sonata s3 = new Sonata();
		
		Porshe p1 = new Porshe();
		Porshe p2 = new Porshe();
		Porshe p3 = new Porshe();
		
		Tesla t1 = new Tesla();
		Tesla t2 = new Tesla();
		Tesla t3 = new Tesla();
		Tesla t4 = new Tesla();
		
//		s1.run();s2.run();s3.run();p1.run();p2.run();
		
//		Sonata[] sonatas = {s1, s2, s3};
//		for(Sonata s : sonatas) {
//			s.run();
//		}
		
		//다형성을 적용해서 이종모음 배열을 선언할 수 있다.
		Car[] cars = {s1,s2,s3,p1,p2,p3,t1,t2,t3,t4};
		for(Car c : cars) {
			c.run();
		}
		
		System.out.println("------------------------------");
		
		System.out.println("*** 타이어 교체작업 ***");
		t1.frontLeft = new HTire();
		t1.frontRight = new HTire();
		t1.rearLeft = new NTire();
		t1.rearRight = new NTire();
		
		System.out.println("------------------------------");
		
		Driver kim = new Driver();
		kim.drive(s1);
		kim.drive(t4);
		kim.drive(p2);
		
		System.out.println("------------------------------");
		
		Tesla myTesla = (Tesla) kim.buyCar("테슬라");
//		c.run();
//		Tesla myTesla = (Tesla)c;
		myTesla.activeAutopilot();
		
		
		

	}

}







