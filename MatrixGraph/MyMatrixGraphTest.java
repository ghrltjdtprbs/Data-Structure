package hw10_1;
import java.util.Scanner;

public class MyMatrixGraphTest {

	public static void main(String[] args) {
		
		System.out.println("hw10_1 : ������");
		Scanner scanner = new Scanner(System.in);
		//������n�� �Է¹���
		System.out.print("���� �� �Է�: ");
		
		int n = scanner.nextInt();
		System.out.println();
		//n�� n�� ���� ����� �Է¹޾� �׷����� ����	
		System.out.println(n+"��"+ n+"���� ���� ��� ���� �Է�:");
		
		int[][] matrix = new int[n][n];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n;j++) {
				matrix[i][j] = scanner.nextInt();
			}
		}
		System.out.println();
		MyMatrixGraph graph = new MyMatrixGraph(matrix,n);
		//�� ���� ���� ��ȣ v1 v2�Է¹���
		
		
	
	 
	   System.out.print("���� ��ȣ(0~9) �ΰ��� �Է�: ");
       int v1= scanner.nextInt();
	   int v2= scanner.nextInt();
	   System.out.println();
	   //���� v1v2 �� �����ϴ��� �˻��Ͽ� �����ϴ� ��� ����ġ�� ���
	   System.out.print("���� <"+v1+","+ v2+ ">�� ����ġ = ");
	   graph.hasEdge(v1,v2);
	   //���� v1�� ���� �������� ���
	   System.out.print("���� "+v1+"�� �������� = ");
	   graph.getindegree(v1);
	   
	   System.out.print(" �������� = ");
	   graph.getOutdegree(v1);
	  
	   //���� v2�� ���� �������� ���
	   System.out.print("���� "+v2+"�� �������� = ");
	   graph.getindegree(v2);
	   
	   System.out.print(" �������� = ");
	   graph.getOutdegree(v2);
	   
	   System.out.print("���� "+v1+"�κ��� ������ ���� = ");
	   graph.printAdjacentVerticed(v1);
	   System.out.println();
	  
	   System.out.print("���� "+v2+"�κ��� ������ ���� = ");
	   graph.printAdjacentVerticed(v2);
	   System.out.println();
	   System.out.print("���� �켱 Ž�� ���� = ");
	   graph.DFSALL();

		   
	   }
	}


