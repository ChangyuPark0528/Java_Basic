package etc.generic.basic;

public class MainClass {

	public static void main(String[] args) {
		
		Box<String> box = new Box<>(); // 자바7 이후로 생성자 타입은 생략이 가능.
		box.setObj("홍길동");
		String name = box.getObj(); //형 변환이 따로 필요없다.
		
		//제네릭에는 기본 데이터 타입을 지정할 수 없음.
		Box<Integer> intbox = new Box();
		intbox.setObj(2);
		int num = intbox.getObj();
		
		Box<Person> pBox = new Box();
		pBox.setObj(new Person());
		Person p = pBox.getObj();
		

	}

}
