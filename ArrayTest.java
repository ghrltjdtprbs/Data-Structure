package hw3_1;
import java.util.Scanner;
class ArrayTest {  
  public static void main(String[] args) {
	System.out.println("hw3_1/ 201814007������");
    System.out.println("�迭 ũ�� �Է�: ");
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();

    int[] array = new int[n];

    System.out.println(n+"���� ���� �Է�: ");
    for(int i=0;i<array.length;i++) {
      array[i]= input.nextInt();
    }
    
    double sum=0;
    for(int i=0; i<array.length;i++) {
      sum+= array[i];
    }
    double avg= sum/n;
    System.out.println("���= "+avg);

    System.out.print("��� �̻��� ����= ");
    int k = 0;
    for(int i=0; i<array.length;i++) {
      if(array[i]>= avg){
        System.out.print(array[i]+" ");
        k++;
      }
    }

    System.out.println("\n��� �̻��� ���� ��= "+k);
  }
}
		
			
		
	


