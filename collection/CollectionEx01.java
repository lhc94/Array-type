package collection;

import java.util.ArrayList;

//22.03.02

//배열과 컬렉션차이
// 배열은 무조건 연속된공간이 있어야 넣을 수 있다 
//ex) 빈 1 빈 빈 //  1,2,3 을 넣을 수 가 없다  연속된 공간이 2개라서...
// 배열은 정해진 크기만 사용할 수 있다

// 컬렉션은 알아서 넣는다
// 컬렉션은 크기가 가변한다.

public class CollectionEx01 {

	public static void main(String[] args) {
		// int, double, char, boolean => 기본자료형 (값)
		// String, 커스텀자료형(클래스) => 래퍼런스자료형 (주소)
		// 랩핑클래스 (기본자료형을 대신하는 클래스) = Integer, Double, Character, Boolean
		ArrayList<Integer> c1 = new ArrayList<Integer>();
		
		c1.add(1);
		c1.add(2);
		c1.add(3);
		
//		System.out.println(c1.get(0));
		
		//for문 
//		for (int i = 0; i < c1.size(); i++) {
//			System.out.println(c1.get(i));
//		}
//		반복 할 때마다 size메서드를 계속 호출하기 때문에 리팩토링 해준다!
		int size = c1.size();
		for (int i = 0; i < size; i++) {
			System.out.println(c1.get(i));
		}
	}
}
