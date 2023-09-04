package oop.obj_arr;

import java.util.Scanner;

public class ScoreMain2 {

	public static void main(String[] args) {
		
		Score2[] scores = new Score2[100];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<scores.length; i++) {
			System.out.println("*** 학생점수 ***");
			System.out.println("'그만'을 입력하면 종료됩니다.");
			
			System.out.print("이름: ");
			String name = sc.next();
			if(name.equals("그만")) {
				System.out.println("입력을 종료합니다.");
				break;
			}
			
			System.out.print("국어: ");
			int kor = sc.nextInt();
			System.out.print("영어: ");
			int eng = sc.nextInt();
			System.out.print("수학: ");
			int math = sc.nextInt();
			
//			int total = kor + eng + math;
//			double avg = total / 3.0;
			
//			scores[i] = new Score2(name, kor, eng, math, total, avg);
			
			scores[i] = new Score2(name, kor, eng, math);
			
			System.out.println("*** 입력완료 ***\n");
			
		} // 입력 반복문 끝
		
		for(Score2 s: scores) {
			if(s == null)break;
			s.score2Info();
			System.out.println("------------------------------");
		}
		
		sc.close();

	}

}




