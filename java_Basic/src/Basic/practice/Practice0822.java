package Basic.practice;

public class Practice0822 {

	public static void main(String[] args) {
		/*
        - 50 ~ 400사이의 난수를 발생시킨 후
        발생한 난수가 홀수인지 짝수인지의 여부를
        3항 연산식으로 출력해 보세요.
        
        ex)
        발생한 난수: XX
        3항 연산의 결과: 홀수입니다. or 짝수입니다.
       */
		
		int rn = (int) ((Math.random()*351)+50);
		System.out.println("랜덤숫자:"+rn);
		
		String result = (rn % 2 == 0 ? "짝수입니다.":"홀수입니다.");
		System.out.println("연산결과:"+result);
		
//		- (조건식 ? 좌항 : 우항);
		
		int x = 100, y = 200;
		String resu = (x > y ? "true":"false");
		
		System.out.println(resu);

	}

}
