
class MyLinkedList {

	private Node head = new Node(null); 
	private int size = 0;  

	private class Node { 

		private Object data; 
		private Node next; 

		public Node(Object input) {
			this.data = input;  
			this.next = null;  
		}

		public String toString() {
			return String.valueOf(this.data);
		}
	}


	public void add(Object input) {
		if (size == 0) {
			Node newNode = new Node(input);
			head = newNode;
			size++;
		}
		else {
			Node temp = head;
			while(temp.next != null) {
				temp = temp.next;
			}
			Node newNode = new Node(input);
			temp.next = newNode;
			size++;
		}
	}

	public Object remove(int k) {
		if(k < 0 || k >= size)
			throw new IndexOutOfBoundsException("삭제 인덱스 " + k + ": 범위를 벗어났습니다.");

		if(k == 0) {
			Node temp = head; 
			head = head.next;
			Object returnData = temp.data;
			temp = null;
			size--;
			return returnData;

		}else {
			Node temp = head;
			for(int i=0; i < k-1; i++) {
				temp = temp.next;	
			}
			Node todoDeleted = temp.next;
			temp.next = todoDeleted.next;
			Object returnData = todoDeleted.data;
			todoDeleted = null;
			size--;
			return returnData;
		}
	}


	public int size() {
		return size;
	}
	

	public String toString() {
		if(head == null) {
			return "[]";
		}
		Node temp = head;
		String str = "[";

		while(temp.next != null) {
			str += temp.data + ", ";
			temp = temp.next;
		}
		str += temp.data;
		return str+"]";
	}
}

public class MyLinkedListTest {
	
	public static void main(String[] args) {
		System.out.println("hw6_1 : 최혜미");
		//1
		MyLinkedList list = new MyLinkedList();
		
		//2
		System.out.println("초기 리스트="+list+", "+"길이="+list.size());
		
		//3
		list.add(11);
		list.add(22);
		list.add(33);
		list.add(44);
		list.add(55);
		list.add(66);
		list.add(77);
		list.add(88);
		list.add(99);
		System.out.println("원소 9개 삽입 후="+list+", "+"길이="+list.size());
		
		//4
		Object item = list.remove(0);
		System.out.println("원소 0 삭제 후="+list+", "+ "삭제된 원소="+item+", "+"길이="+list.size());
		
		//5
		Object item2 = list.remove(4);
		System.out.println("원소 4 삭제 후="+list+", "+ "삭제된 원소="+item2+", "+"길이="+list.size());
		
		//6
		Object item3 = list.remove(6);
		System.out.println("원소 6 삭제 후="+list+", "+ "삭제된 원소="+item3+", "+"길이="+list.size());
		
		//7
		Object item4 = list.remove(6);
	}

}
