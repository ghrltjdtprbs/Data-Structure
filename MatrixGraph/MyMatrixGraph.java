package hw10_1;
import java.util.Scanner;

public class MyMatrixGraph {
	Scanner scanner = new Scanner(System.in);
	private int[][] matrix;
	private int n;
	private boolean[] visited;
	
	public MyMatrixGraph(int[][] x, int n ) {
		//ũ�Ⱑ n�� �迭�� �ʱ�ȭ
		matrix = new int[n][n];
		matrix=x;
		this.n = n;
	}
	
	public int[][] get() {
		return matrix;
	}
	
	
	public void getindegree(int v) {
		//����v�� ���������� ����Ͽ� ����
		int sum=0;
		
		for(int i=0; i<matrix.length;i++) {
			if(matrix[i][v]!=0) {
			  sum++;
			  
			}
			
		}
		System.out.print(sum);	
	    	
	
	}
	public void getOutdegree(int v) {
		//����v�� ���������� ����Ͽ� ����
		int sum=0;
		
		for(int i=0; i<matrix.length;i++) {
			if(matrix[v][i]!=0) {
				  sum++;
				}
			
		}
		System.out.println(sum);	
		
	}
	
	public void hasEdge(int v1, int v2) {
		//�׷��� ����ġ ���
     	if(matrix[v1][v2]!= 0){
     		System.out.println(matrix[v1][v2]);
     		
	      	}
	    else {
	    	System.out.println("�������� ����");
	     }
		}
	
	
	
	// ���� v�� ������ ���� ��ȣ�� ���
		public void printAdjacentVerticed(int v) {
			for(int i = 0; i < matrix.length; i++) {
				if(matrix[v][i] != 0) {
					System.out.print(i+" ");
				}
			}
			/*for(int i = 0; i < matrix.length; i++) {
				if(matrix[i][v] != 0) {
					System.out.print(i+" ");
				}
			}*/
		}
		
		// �׷��� ��� ���� �湮
		public void DFSALL() {
			this.visited = new boolean[this.n];
			for(int i = 0; i < n; i++)
				if(visited[i] == false)
					dfs(i);
		}
		
		// �׷��� Ž�� (���ȣ��)
		public void dfs(int here) {
			this.visited[here] = true;
			System.out.print(here+" ");
			
			for(int i = 0; i < this.n; i++) {
				if(matrix[here][i] != 0 && !visited[i]) {
					dfs(i);
				}
			}	
		}
	}
	
	



	
