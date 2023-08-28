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
	        
	        System.out.print("정수 1: ");
	        int num1 = sc.nextInt();
	        System.out.print("정수 2: ");
	        int num2 = sc.nextInt();
	        System.out.print("정수 3: ");
	        int num3 = sc.nextInt();
	        
	        int max = 0;
	        int mid = 0;
	        int min = 0;
	        
	        if(num1 > num2 && num1 > num3) { //num1 이 max다! //만약 num1의 값이 num2의 값보다 크고(&&) num1이 num3의 값보다 클때
	            max = num1; //max의 값은 num1이 된다.
	            if(num2 > num3) {//만약 num2의 값이 num3보다 크다면
	                mid = num2; min = num3; //mid의 값은 num2고 min의 값은 num3
	            } else {//위 조건이 다 아닐때
	                mid = num3; min = num2;//mid는 num3이되고 min은 num2가된다.
	            }
	        } else if(num2 > num1 && num2 > num3) { //num2가 max다!
	            max = num2;
	            if(num1 > num3) {
	                mid = num1; min = num3;
	            } else {
	                mid = num3; min = num1;
	            }
	        } else { //num3가 max다!
	            max = num3;
	            if(num1 > num2) {
	                mid = num1; min = num2;
	            } else {
	                mid = num2; min = num1;
	            }
	        }
	        
	        System.out.println("----------------------------");
	        System.out.println("최대값: " + max);
	        System.out.println("중간값: " + mid);
	        System.out.println("최소값: " + min);
	
	
	
	
	
	
//	int max = 0;
//	int mid = 0;
//	int min = 0;
//	
//	if(num >= num2 && num >= num3) {
//		max = num;
//	}else if (num2 >= num && num2 >= num3) {
//		max = num2;
//	}else {
//		max = num3;
//		System.out.println("가장 큰 값은: "+max+" 입니다.");
//	}
//
//	if(num >= num2 && num <= num3) {
//		mid = num;
//	}else if (num2 >= num && num2 <= num3) {
//		mid = num2;
//	}else {
//		mid = num3;
//		System.out.println("중간의 값은: "+mid+" 입니다.");
//	}
//	
//	if(num <= num2 && num <= num3) {
//		min = num;
//	}else if (num2 <= num && num2 <= num3) {
//		min = num2;
//	}else {
//		min = num3;
//		System.out.println("가장 작은값은: "+min+" 입니다.");
//	}
	
	
	
	}

}
