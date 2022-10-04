package hw10_1;
import java.util.Scanner;

public class MyMatrixGraphTest {

	public static void main(String[] args) {
		
		System.out.println("hw10_1 : 최혜미");
		Scanner scanner = new Scanner(System.in);
		//정점수n을 입력받음
		System.out.print("정점 수 입력: ");
		
		int n = scanner.nextInt();
		System.out.println();
		//n행 n열 인접 행렬을 입력받아 그래프를 생성	
		System.out.println(n+"행"+ n+"열의 인접 행렬 원소 입력:");
		
		int[][] matrix = new int[n][n];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n;j++) {
				matrix[i][j] = scanner.nextInt();
			}
		}
		System.out.println();
		MyMatrixGraph graph = new MyMatrixGraph(matrix,n);
		//두 개의 정점 번호 v1 v2입력받음
		
		
	
	 
	   System.out.print("정점 번호(0~9) 두개를 입력: ");
       int v1= scanner.nextInt();
	   int v2= scanner.nextInt();
	   System.out.println();
	   //간선 v1v2 가 존재하는지 검사하여 존재하는 경우 가중치를 출력
	   System.out.print("간선 <"+v1+","+ v2+ ">의 가중치 = ");
	   graph.hasEdge(v1,v2);
	   //정점 v1의 진입 진출차수 출력
	   System.out.print("정점 "+v1+"의 진입차수 = ");
	   graph.getindegree(v1);
	   
	   System.out.print(" 진출차수 = ");
	   graph.getOutdegree(v1);
	  
	   //정점 v2의 진입 진출차수 출력
	   System.out.print("정점 "+v2+"의 진입차수 = ");
	   graph.getindegree(v2);
	   
	   System.out.print(" 진출차수 = ");
	   graph.getOutdegree(v2);
	   
	   System.out.print("정점 "+v1+"로부터 인접한 정점 = ");
	   graph.printAdjacentVerticed(v1);
	   System.out.println();
	  
	   System.out.print("정점 "+v2+"로부터 인접한 정점 = ");
	   graph.printAdjacentVerticed(v2);
	   System.out.println();
	   System.out.print("깊이 우선 탐색 순서 = ");
	   graph.DFSALL();

		   
	   }
	}


