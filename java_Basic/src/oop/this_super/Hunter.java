package oop.this_super;

public class Hunter extends Player {
	
	String pet;
	
	Hunter(String name){
		super(name);
		this.pet = "강아지";
	}
	
	@Override
	void characterInfo() {
		super.characterInfo();
		System.out.println("# 펫 이름: " + this.pet);
	}

}
