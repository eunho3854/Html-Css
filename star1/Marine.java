package star1;

class Marine {	
	// 멤버변수 = 필드 = heap변수 = 전역변수 = 속성 = 프로퍼티
	// field, property는 private로 만든다. 마법x
	private String name;
	private int hp;
	private int attack;
	
	// this는 heap을 가르킨다.
	public Marine(String name, int hp, int attack) {
		this.name = name;	// this를 붙이면 heap 변수
		this.hp = hp;
		this.attack = attack;
	}
	
	public Marine() {
	}
	
}
