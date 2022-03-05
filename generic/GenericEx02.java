package generic;

// 22.03.02

// 제네릭
// 어떤 객체 클래스들을 만들 때 
// 타입이 정해져있지 않으면 불편하니까 제네릭을 쓴다

class 호랑이 {
	String name = "호랑이";
}

class 사자 {
	String name = "사자";
}


//재내릭 쓰지 않았을경우...
//class 큰바구니 {
//	Object data;
//}


//public class GenericEx02 {
//	public static void main(String[] args) {
//		큰바구니 s1 = new 큰바구니();
//		s1.data = new 호랑이();
		
	//	System.out.println(s1.data.name);
	//  s1이 바라보는 변수가 큰바구니이기 때문에 호랑이를 출력할 수 없다
	//  다운캐스팅해야됨
//		호랑이 h1 = (호랑이) s1.data;
//		System.out.println(h1.name);
//	}
//}
class 큰바구니<T> {
	T data;
}

public class GenericEx02 {
	public static void main(String[] args) {
		큰바구니<호랑이> s1 = new 큰바구니<>();
		s1.data = new 호랑이();
		System.out.println(s1.data.name);
		
		큰바구니<사자> s2 = new 큰바구니<>();
		s2.data = new 사자();
		System.out.println(s2.data.name);
	}
}
