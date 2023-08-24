package Basic.operator;

public class PlusMinusOperator {

	public static void main(String[] args) {
		
		//증감 연산자 (++, --)
		//변수의 값을 단순히 하나 올리거나 내릴 때 사용한다.
		
		int i = 1;
		int j = i++; //후위 연산 (선연산 후증감)
		int k = i--;
		
		System.out.println("i의 값: " + i);//1
		System.out.println("j의 값: " + j);//1
		System.out.println("k의 값: " + k);//2
		
		
		System.out.println("================================");
		
		int x = 1;
		int y = ++x; //전위 연산 (선증감 후연산)
		int z = --x;
		
		System.out.println("x의 값:"+x);//1
		System.out.println("y의 값:"+y);//2
		System.out.println("z의 값:"+z);//1
		
		int a = 3;
		int b = ++a + 5 * 3;
	
		
		System.out.println(b);//19
		System.out.println(a);//4
		
		

	}

}
