package oop.obj_arr;

/*
- 이름, 국어, 영어, 수학, 총점, 평균(double)을
 담을 수 있는 객체를 디자인하세요.
 
- 학생의 모든 정보를 한 눈에 확인할 수 있게
 scoreInfo() 메서드를 선언해 주세요.
 메서드 내부에는 출력문을 이용해서 모든 정보를 출력해 주세요.
 
- 캡슐화를 구현해서 작성해 주세요. (생성자는 맘대로 하세요.)
*/

public class Score {
	
	private String name;
	private int kor;
	private int eng;
	private int math;
	int all;
	double avg;

	
	
	
	public void scoreInfo() {
		System.out.println("이름: " + this.name);
		System.out.println("국어: " + this.kor);
		System.out.println("영어: " + this.eng);
		System.out.println("수학: " + this.math);
		
		System.out.println("총점: " + all);
		System.out.printf("평균: %.1f \n", avg);
	}

	public Score(String name, int kor, int eng, int math){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
		int all = kor+eng+math;
		this.all = all;
		double avg = (kor+eng+math)/3.0;
		this.avg = avg;
		
		
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getKor() {
		return kor;
	}


	public void setKor(int kor) {
		
		this.kor = kor;
	}


	public int getEng() {
		return eng;
	}


	public void setEng(int eng) {
		this.eng = eng;
	}


	public int getMath() {
		return math;
	}


	public void setMath(int math) {
		this.math = math;
	}


	public int getAll() {
		return all;
	}


	public void setAll(int all) {
		this.all = all;
	}


	public double getAvg() {
		return avg;
	}


	public void setAvg(double avg) {
		this.avg = avg;
	}
	
	

}
