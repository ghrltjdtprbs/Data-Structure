package hw5_2;

public class MyList {
	private int size;
	private int[] list;
	
	public MyList(int size) {
		this.list = new int[size];
		this.size = 0;
	}
	
	public void add(int val) {
		if (size == this.list.length) return;
		
		this.list[size++] = val;
	}
	
	public int remove(int idx) {
		if ((idx < 0) || (idx >= this.size)) return -1;
		
		int removed = this.list[idx];
		for (int i = idx+1; i < this.size; i++) {
			this.list[i-1] = this.list[i];
		}
		this.size--;
		
		return removed;
	}
	
	public int size() {
		return this.size;
	}
	
	@Override
	public String toString() {
		if (this.size == 0) return "[]";
		
		String str = "[";
		for (int i = 0; i< this.size-1; i++) {
			str += String.valueOf(this.list[i]) + ", ";
		}
		str += this.list[this.size-1];
		
		return str + "]";
		
	}
}
