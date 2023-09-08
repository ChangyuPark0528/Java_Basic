package etc.enum_.basic;

public enum Languages {
	
	//상수("연관시킬 문자")
	JAVA("자바"), 
	PYTHON("파이썬"), 
	CPP("C++"), 
	JAVASCRIPT("자바스크립트"), 
	C("C"); //세미콜론 붙이기
	
	final private String name; //상수와 연관시킬 문자값을 담을 필드 선언.
	
	public String getName() { // 한글 이름을 얻어내기위한 메서드(name -> private)
		return name;
	}
	
	//외부에서 enum 타입의 상수를 사용 시 enum 객체가 생성됨.
	//위에 선언한 방식의 상수와 연관 문자를 전달해서 name 필드에 값을 초기화.
	private Languages(String name) {
		this.name = name;
	}
	
	
}
