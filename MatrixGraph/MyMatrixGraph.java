package hw10_1;
import java.util.Scanner;

public class MyMatrixGraph {
	Scanner scanner = new Scanner(System.in);
	private int[][] matrix;
	private int n;
	private boolean[] visited;
	
	public MyMatrixGraph(int[][] x, int n ) {
		//크기가 n인 배열로 초기화
		matrix = new int[n][n];
		matrix=x;
		this.n = n;
	}
	
	public int[][] get() {
		return matrix;
	}
	
	
	public void getindegree(int v) {
		//정점v의 진입차수를 계산하여 리턴
		int sum=0;
		
		for(int i=0; i<matrix.length;i++) {
			if(matrix[i][v]!=0) {
			  sum++;
			  
			}
			
		}
		System.out.print(sum);	
	    	
	
	}
	public void getOutdegree(int v) {
		//정점v의 진출차수를 계산하여 리턴
		int sum=0;
		
		for(int i=0; i<matrix.length;i++) {
			if(matrix[v][i]!=0) {
				  sum++;
				}
			
		}
		System.out.println(sum);	
		
	}
	
	public void hasEdge(int v1, int v2) {
		//그래프 가중치 출력
     	if(matrix[v1][v2]!= 0){
     		System.out.println(matrix[v1][v2]);
     		
	      	}
	    else {
	    	System.out.println("존재하지 않음");
	     }
		}
	
	
	
	// 정점 v에 인접한 정점 번호를 출력
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
		
		// 그래프 모든 정점 방문
		public void DFSALL() {
			this.visited = new boolean[this.n];
			for(int i = 0; i < n; i++)
				if(visited[i] == false)
					dfs(i);
		}
		
		// 그래프 탐색 (재귀호출)
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
	
	



	
