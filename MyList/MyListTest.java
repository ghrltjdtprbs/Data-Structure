package hw5_2;

public class MyListTest {

	public static void main(String[] args) {
		
		MyList list = new MyList(100);
		System.out.println("hw5_2 : ������");
		System.out.println("�ʱ� ����Ʈ=" + list + ", ����=" + list.size());
		
		list.add(11);
		list.add(22);
		list.add(33);
		list.add(44);
		list.add(55);
		list.add(66);
		list.add(77);
		list.add(88);
		list.add(99);// ����Ʈ�� 9������ ����
		System.out.println("���� 9�� ���� ��=" + list + ", ����=" + list.size());// ���� ���� �� ����Ʈ ���
		
		int removed = list.remove(0);// �ε���0 ����
		System.out.println("�ε��� 0 ���� ��=" + list + ",������ ����=" + removed + ", ����=" + list.size());// ������ ����Ʈ ���
		
		removed = list.remove(4);// �ε���4 ����
		System.out.println("�ε��� 4 ���� ��=" + list + ",������ ����=" + removed + ", ����=" + list.size());// ������ ����Ʈ ���
		
		removed = list.remove(6);// �ε�����6 ����
		System.out.println("�ε��� 6 ���� ��=" + list + ",������ ����=" + removed + ", ����=" + list.size());// ������ ����Ʈ ���
		

	}

}
