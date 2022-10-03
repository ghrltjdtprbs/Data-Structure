package hw9_1;

import java.util.Scanner;

public class MyMaxHeapTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("hw9_1: 최혜미");
        System.out.print("최대 힙 용량 입력: ");
        int capa = scanner.nextInt();
        MyMaxHeap heap = new MyMaxHeap(capa);

        System.out.print(capa + "개의 정수 입력: ");
        for (int i = 0; i < capa; i++) {
            int num = scanner.nextInt();

            heap.Insert(num);
        }

        System.out.println(heap.toString());
        System.out.print("최대 힙 삭제 순서 = ");

        while (!heap.isEmpty()) {
            int num = heap.DeleteMax();
            System.out.print(num + " ");
        }
    }
}