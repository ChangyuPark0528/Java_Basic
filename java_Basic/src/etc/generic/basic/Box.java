package etc.generic.basic;

public class Box<T> { //제네릭 클래스로 선언 //T,E 를 많이사용 (타입,엘리먼트)
	
	private T obj;

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}
	
	
	
	
}
