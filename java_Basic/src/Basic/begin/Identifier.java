package Basic.begin;

public class Identifier {

	public static void main(String[] args) {
		
		//1.식별자의 이름은 중복을 허용하지않는다.
		//그리고 대,소문자를 철저하게 구분한다.
		
		int age = 35;
//		int age = 40;(x)
		int Age = 40;
		
		System.out.println(age);
		System.out.println(Age);
		
		//2.식별자 이름은 숫자로 지정하거나 숫자로 시작하면 안된다.
//		int 700 = 365;(x)
//		int 7number = 7;(x)
		int number = 7;
		int num7ber = 7;
		int num1235ber = 123;
		
		//3. 식별자 이름에 공백을 포함할 수 없다.
//		int my birth day = 19921013; (x)
		int mybirthday = 19921013;
		int myBirthDay = 19921013; //camel case 표기법
		
		//4.식별자에 쓸 수 있는 특수문자는 밑줄(_),달러기호($)
		//뿐이다. 하지만 권장하진 않음
		//저 특수문자들은 사용하기로 약속된곳이 지정되어있음
		String $hello_ = "안녕";
		
		//5.키워드(예약어)는 식별자 이름으로 사용불가능
		//키워드는 이미 어떠한 내용을 내포하고 있는 지정 문자.
//		String class = "클래스";(x)
		String Class = "클래스"; //대문자로 사용은 가능하나, 권장하지않음
		String className = "클래스";
		
		//6. 한글이나 한자같은 식별자 이름도 지정이가능하나
		//	사용을 권장하지 않음.
		int 숫자 = 10;
		String 名 = "춘식이";
		
		System.out.println(숫자);
		System.out.println(名);
		
		
		
	}

}
