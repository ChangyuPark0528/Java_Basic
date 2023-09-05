package etc.api.lang.obj;

import java.util.Objects;

public class Person implements Cloneable{
	
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	



	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	@Override
	// Person 객체의 이름을 비교해주는 메서드로 override
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(obj instanceof Person) {
			Person p = (Person) obj; //Object 타입을 Person 타입으로 형 변환 -> name과 age를 확인가능.
			if(this.name.equals(p.name) && this.age == p.age) {
				return true;
			}
		}
		return false;
	}
	
	
	//equals를 오버라이딩 할 때는 hashCode도 함께 오버라이딩을 진행 해 주는것이 좋다.
	//equals를 재 정의 한다는 것은 내가 원하는 방식의 동등비교를 하겠다는 것이기 때문에
	//hashcode의 값도 그에 맞게 같이 재 정의되어야 한다.(hash 주소를 equals)
	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}

	
	
	@Override
	protected void finalize() throws Throwable {
		//생성된 객체가 사라지는 시점에서 자동으로 호출 (gc가 실행될 때)
		System.out.println(this.name + "이(가) 죽었습니다.");
	}
	
	//객체 복사메서드
	//cloneable 인터페이스를 구현해서 사용해야함.
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public void personInfo() {
		System.out.println("이름: " + name);
		System.out.println("나이: " + age + "세");
	}
	

}
