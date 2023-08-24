package Basic.Constate;

import java.util.Scanner;

public class IfQuiz01 {

	public static void main(String[] args) {
		 /*
        - 정수를 2개 입력받아서, 두 정수 중 어느 수가 큰 지
        혹은 같은지를 판별하시면 됩니다.
        ex)
        입력받은 수: 4, 7 -> 7이 큰 수 입니다.
        입력받은 수: 10, 3 -> 10이 큰 수 입니다.
        입력받은 수: 5, 5 -> 같은 수 입니다.
       */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();
		
		System.out.print("숫자를 입력하세요: ");
		int num2 = sc.nextInt();
		
		if (num > num2) {
			System.out.println(num+","+num2+"->"+num+"이(가) 큰 수입니다.");
		}else if(num2 > num) {
			System.out.printf("%d, %d -> %d 이(가)큰 수 입니다.",num,num2,num2);
			}
		else if(num2 == num) {
			System.out.println(num+","+num2+"-> 같은 수 입니다.");
			}
		
		sc.close();
	}

}
