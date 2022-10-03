package hw5_2;

public class MyListTest {

	public static void main(String[] args) {
		
		MyList list = new MyList(100);
		System.out.println("hw5_2 : 최혜미");
		System.out.println("초기 리스트=" + list + ", 길이=" + list.size());
		
		list.add(11);
		list.add(22);
		list.add(33);
		list.add(44);
		list.add(55);
		list.add(66);
		list.add(77);
		list.add(88);
		list.add(99);// 리스트에 9개원소 삽입
		System.out.println("원소 9개 삽입 후=" + list + ", 길이=" + list.size());// 원소 삽입 후 리스트 출력
		
		int removed = list.remove(0);// 인덱스0 삭제
		System.out.println("인덱스 0 삭제 후=" + list + ",삭제된 원소=" + removed + ", 길이=" + list.size());// 삭제후 리스트 출력
		
		removed = list.remove(4);// 인덱스4 삭제
		System.out.println("인덱스 4 삭제 후=" + list + ",삭제된 원소=" + removed + ", 길이=" + list.size());// 삭제후 리스트 출력
		
		removed = list.remove(6);// 인덱스스6 삭제
		System.out.println("인덱스 6 삭제 후=" + list + ",삭제된 원소=" + removed + ", 길이=" + list.size());// 삭제후 리스트 출력
		

	}

}
