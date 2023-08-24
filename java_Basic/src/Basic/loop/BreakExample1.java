package Basic.loop;

public class BreakExample1 {

	public static void main(String[] args) {
		
		for(int i=1; i<=10; i++) {
			if(i > 6) break;
			System.out.print(i + " ");
		}
		
		System.out.println("\n반복문 종료");
		
		System.out.println("---------------------------------------------");
		
		/*
        - 내부 반복문에 포함된 break로 바깥쪽 반복문까지 한번에
         종료시키고 싶다면 바깥쪽 반복문에 label을 붙입니다.
         그리고, break 선언 시 label을 함께 선언합니다. 
        */
		
		outer: for(int i=0; i<=2; i++) { //outer : 이름을 지어줌
			for(int j=0; j<=1; j++) {
				if(i == j) break outer;//이름 지어준 for문으로 탈출 
				System.out.println(i + "-" + j);
			}
		} 
		//0-1은 0-0에서 탈출문(break;)실행으로 출력x
		//1-0
		//2-0
		//2-1
		
		

	}

}









