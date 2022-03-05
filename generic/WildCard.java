package generic;

// 와일드카드  ?
// 무엇을 리턴 할 지 모를 경우
// <? extends Object> ? : 모든클래스

abstract class 공 {
	abstract String getName();
}

class 농구공 extends 공 {
	
	private String name = "농구공";

	// 자식이 부모의 메서드와 동일한 것을 들고 있으면
	// 부모의 메서드가 오버라이드(무효화) 된다.
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

class 축구공 extends 공 {
	private String name = "축구공";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

class 가방<T> {
	private T data;
	
	public T getData() {
		return data;
	}
	
	public void setData(T data) {
		this.data = data;
	}
}

public class WildCard {
	
	// 이용 할 때. 와일트카드  가방안에 농구공과 축구공을 넣고 싶었음
	// 그런데 if문안에 이미 축구공을 넣어버려서 else에는 가방<> 안에 농구공을 넣을 수 없음
	// return값이 달라져버려서
	// 이떄 와일드카드를쓴다
	
	// 활용. 그런데 와일드카드는 기본적으로 Object가 수퍼클래스라서 이 함수를 출력할 경우
	// 원하는 값을 출력을 못한다(출력값은 해시코드로만 나올 것이다)
	// 이때 <? extends object>를 <? extends 공>으로 바꾸면된다 
	static 가방<? extends 공> 꺼내기(int time) { //9시 축구 12시 농구
		if(time == 9) {
			System.out.println("가방에 축구공이 담겼어요");
			축구공 g1 = new 축구공();
			가방<축구공> b1 = new 가방<>();
			b1.setData(g1);
			return b1;
		} else {
			System.out.println("가방에 농구공이 담겼어요");
			농구공 g1 = new 농구공();
			가방<농구공> b1 = new 가방<>();
			b1.setData(g1);
			return b1;
		}
	}
	
	// 재네릭 고급 = 다형성, Object, 추상클래스, 오버라이드(무효화)
	// 동적바인딩
	public static void main(String[] args) {
		가방<? extends 공> r1 = 꺼내기(9);
		가방<? extends 공> r2 = 꺼내기(12);
		
		// 공은 getName안에 메서드가 없다
		System.out.println(r1.getData().getName());
		System.out.println(r2.getData().getName());
	}
}
