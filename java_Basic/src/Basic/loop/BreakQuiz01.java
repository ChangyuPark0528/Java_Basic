package Basic.loop;

import java.util.Scanner;

public class BreakQuiz01 {

	public static void main(String[] args) {

		/*
        1. 2가지의 정수를 1~100사이의 난수를 발생시켜서 
         지속적으로 문제를 출제한 후 정답을 입력받으세요.
         사용자가 0을 입력하면 반복문을 탈출시키세요.

        2. 종료 이후에 정답 횟수와 오답 횟수를 각각 출력하세요.
		 */

		Scanner sc = new Scanner(System.in);


		//		int count1 = 0;
		//		int count2 = 0;
		//		
		//		while(true) {
		//			int num = (int) ((Math.random()*100) + 1);
		//			int num2 = (int) ((Math.random()*100) + 1);
		//			System.out.printf("%d + %d = \n",num,num2);
		//			System.out.println("0을 입력하면 종료됩니다.");
		//			System.out.print("> ");
		//			int answer = sc.nextInt();
		//			
		//			if(answer == num+num2) {
		//				System.out.println("정답입니다.");
		//				count1++;
		//			}else if(answer == 0) {
		//				System.out.println("종료됩니다.");
		//				break;
		//			}else {
		//				System.out.println("오답입니다.");
		//				count2++;
		//			}
		//			
		//		}
		//		
		//		System.out.println("정답횟수: "+count1);
		//		System.out.println("오답횟수: "+count2);

		int count1 = 0;
		int count2 = 0;

		while(true) {
			int num = (int) ((Math.random()*100) + 1);
			int num2 = (int) ((Math.random()*100) + 1);
			int nu = (int) (Math.random()*2);

			int correct; //정답
			if(nu == 0) {
				System.out.printf("%d + %d = ??\n",num,num2);
				correct = num + num2;
			}else {
				System.out.printf("%d - %d = ??\n",num,num2);
				correct = num - num2;
			}

			System.out.println("0을 입력하면 종료됩니다.");
			System.out.print("> ");
			int answer = sc.nextInt();

			if(answer == correct) {
				System.out.println("정답입니다.");
				count1++;
			}else if(answer == 0) {
				System.out.println("종료됩니다.");
				System.out.println("------------------");
				break;
			}else {
				System.out.println("오답입니다.");
				count2++;
			}

		}

		System.out.println("정답횟수: "+count1);
		System.out.println("오답횟수: "+count2);


		sc.close();
	}

}
