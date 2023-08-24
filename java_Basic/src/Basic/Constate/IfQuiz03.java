package Basic.Constate;

import java.util.Scanner;

public class IfQuiz03 {

	public static void main(String[] args) {
		/*
        - 정수 3개를 입력 받습니다.
        - 가장 큰 값, 가장 작은 값, 중간값을 구해서 출력해 보세요.
        
        # max, mid, min이라는 변수를 미리 선언하셔서
         판별이 될 때마다 각각의 변수에 값을 넣어줍니다.
         마지막에 한번에 출력하시면 되겠습니다.
        */
		
	Scanner sc = new Scanner(System.in);
	
	System.out.print("정수를 입력하시오: ");
	int num = sc.nextInt();
	System.out.print("정수를 입력하시오: ");
	int num2 = sc.nextInt();
	System.out.print("정수를 입력하시오: ");
	int num3 = sc.nextInt();
	
	int max = 0;
	int mid = 0;
	int min = 0;
	
	if(num >= num2 && num >= num3) {
		max = num;
	}else if (num2 >= num && num2 >= num3) {
		max = num2;
	}else {
		max = num3;
		System.out.println("가장 큰 값은: "+max+" 입니다.");
	}

	if(num >= num2 && num <= num3) {
		mid = num;
	}else if (num2 >= num && num2 <= num3) {
		mid = num2;
	}else {
		mid = num3;
		System.out.println("중간의 값은: "+mid+" 입니다.");
	}
	
	if(num <= num2 && num <= num3) {
		min = num;
	}else if (num2 <= num && num2 <= num3) {
		min = num2;
	}else {
		min = num3;
		System.out.println("가장 작은값은: "+min+" 입니다.");
	}
	
	
	
	}

}
