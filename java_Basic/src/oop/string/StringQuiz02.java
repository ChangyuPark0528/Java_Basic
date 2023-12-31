package oop.string;

import java.util.Scanner;

public class StringQuiz02 {

	public static void main(String[] args) {
		
		/*
        1. 주민등록번호 13자리를 입력받습니다.
        2. 주민등록번호는 -을 포함해서 받을 예정입니다.
        3. 13자리가 아니라면 다시 입력받습니다.
        4. 남자인지 여자인지를 구분해서 출력해 주시면 됩니다.
        */
		
		Scanner sc = new Scanner(System.in);
		
//		while(true) {
//			System.out.print("주민번호를 입력해 주세요: ");
//			String num = sc.nextLine();
//			num = num.trim();
//			
//			if(num.length() < 13) {
//				System.out.println("다시 입력해주세요.");
//			}else if(num.length() == 13) {
//				String number = num;
//				String[] numbers = number.split("-");
//				
//			}
//		}
		
		outer:while(true) {
			System.out.print("주민번호를 입력해 주세요: ");
			String ssn = sc.next();
			
			ssn = ssn.replace("-", "");
			
			if(ssn.length() !=13) {
				System.out.println("주민등록번호는 13자리입니다.");
			}else {
				switch (ssn.charAt(6)) {
				case'1': case'3':
					System.out.println("남자입니다.");
					break outer;
				case'2': case'4':
					System.out.println("여자입니다.");
					break outer;
				default:
					System.out.println("잘못 입력했습니다.");
				}
			}
		}
		sc.close();
	}

}
