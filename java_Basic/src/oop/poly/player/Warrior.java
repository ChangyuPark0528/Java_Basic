package oop.poly.player;

public class Warrior extends Player{

	int rage;
	
	Warrior(String name){
		super(name);
		this.rage = 60;
	}
	
//	public void rush(Player r) {
//		if(r instanceof Mage) {
//			r.hp -= 20;
//			System.out.println(this.name + r.name +"20의 피해를 주었습니다. 남은체력은" + r.hp);
//		}else if(r instanceof Warrior){
//			r.hp -= 10;
//			System.out.println("10의 피해를 주었습니다. 남은체력은" + r.hp);
//		}else if(r instanceof Hunter) {
//			r.hp -= 15;
//			System.out.println("15의 피해를 주었습니다. 남은체력은" + r.hp);
//		}
//	}
	
	int damage; String job;
	public void rush(Player r) {
		if(r instanceof Warrior) {
			damage = 10; job = "전사";
		}else if(r instanceof Mage) {
			damage = 20; job = "마법사";
		}else {
			damage = 15; job = "사냥꾼";
		}
		r.hp -= damage;
		
		System.out.printf("%s가 %s에게 %d의 피해를 주었습니다. 남은체력: %d "
				,this.name, r.name, damage, r.hp );
	}
	
	
	
	
	
	/*
    - 전사의 고유 기능인 rush 메서드를 작성합니다.
    
    - rush의 대상은 모든 직업들 입니다.
    
    - 만약 rush의 대상이 전사라면 10의 피해를 받고,
     마법사라면 20의 피해를 받고, 사냥꾼이라면 15의 피해를 받습니다.
     
    - 서로 다른 데미지를 instanceof를 사용하여 구분해서 적용해 주세요.
    
    - 남은 체력도 출력해 주세요.
    
    - main에서 객체를 생성한 후 호출하셔서 잘 적용됐는지 확인해 주세요.
    */
	
	
	@Override
	void characterInfo() {
		super.characterInfo();
		System.out.println("# 분노: " + rage);
	}
	
	
}




