package hw11_1;
import java.util.Scanner;
import java.util.Random;


class Sort{
	public void InsertionSort(int a[], int size) {
		
		int i, j, t, temp;
		for(i=1;i<size;i++) {
			temp = a[i];
			j=i;
			while((j>0) && (a[j-1]>temp)) {
				a[j] = a[j-1];
				j--;
			}
			a[j]=temp;
			
				
		}
		System.out.print("\n���� �� = ");
		for(int z=0;z<a.length;z++) {
			System.out.print( a[z]+" ");
		}
		
	}
}

public class InsertionSortTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Random rd = new Random();
		
		
		
		System.out.println("hw11_1: ������");
		System.out.print("���� ���� �Է�: ");
		
		int size= scanner.nextInt();
		
		int a[]= new int[size];
		Sort S = new Sort();
		System.out.print("���� �Է�: ");
		int min= scanner.nextInt();
		System.out.print("���� �Է�: ");
		int max= scanner.nextInt();
		System.out.print("���� �� = ");
		for(int i=0;i<a.length;i++) {
		
		  a[i]=rd.nextInt(max-min+1)+min;
		  System.out.print(a[i]+" ");
		}
		
		
		S.InsertionSort(a,size);
	}

	}
