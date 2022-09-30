package hw3_1;
import java.util.Scanner;
class ArrayTest {  
  public static void main(String[] args) {
	System.out.println("hw3_1/ 201814007최혜미");
    System.out.println("배열 크기 입력: ");
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();

    int[] array = new int[n];

    System.out.println(n+"개의 정수 입력: ");
    for(int i=0;i<array.length;i++) {
      array[i]= input.nextInt();
    }
    
    double sum=0;
    for(int i=0; i<array.length;i++) {
      sum+= array[i];
    }
    double avg= sum/n;
    System.out.println("평균= "+avg);

    System.out.print("평균 이상인 원소= ");
    int k = 0;
    for(int i=0; i<array.length;i++) {
      if(array[i]>= avg){
        System.out.print(array[i]+" ");
        k++;
      }
    }

    System.out.println("\n평균 이상인 원소 수= "+k);
  }
}
		
			
		
	


