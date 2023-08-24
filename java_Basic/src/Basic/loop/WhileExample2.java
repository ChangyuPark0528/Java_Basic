package Basic.loop;

public class WhileExample2 {

	public static void main(String[] args) {
		
		//48~150사이의 정수 중 8의 배수만 가로로 출력
		//(48부터 숫자를 하나씩 올려가며 8의 배수를 판별)
		
		int i = 48; //begin
		System.out.print("8의 배수: ");
		while(i <= 150) { //and
			if(i%8 == 0) {
				System.out.print(i + " ");
			}
			i++; //step
		}
		
		System.out.println(); //단순 줄 개행

		//1~100까지의 정수 중 4의 배수이면서
		//8의 배수는 아닌 수를 가로로 출력
		
		int n = 1; //begin
		
		while(n <= 100) { //and
			if(n%4 == 0) {
				if(n%8 != 0)
					System.out.print(n + " ");
			}		
			n++; //step
		}
	
		System.out.println();
		//1~30,000까지의 정수중 258의 배수의 개수를 출력.
		
		int s = 1; //begin
		int count = 0; //배수의 개수를 세 줄 변수
		
		while(s <= 30000) {
			if(s % 258 == 0) {
				count++;
			}
			
			s++; //step
		}
		System.out.println("1~30,000중 258의 배수의개수:"+count);
		
		//1000의 약수의 개수를 구하시오.
		//1~1000까지 하나씩 올려가며 1000이랑 나눠 떨어지는 수가 약수
		
//		int c = 1;
//		int mu = 0;
//		
//		while(c <= 1000) {
//			if(1000 % c ==0) {
//				mu
//			}
//
//		}
//		System.out.print("1000의 약수의 개수: "+mu);
		
		
		
		
	}

}










