package hw9_1;

import java.util.Scanner;

public class MyMaxHeapTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("hw9_1: ������");
        System.out.print("�ִ� �� �뷮 �Է�: ");
        int capa = scanner.nextInt();
        MyMaxHeap heap = new MyMaxHeap(capa);

        System.out.print(capa + "���� ���� �Է�: ");
        for (int i = 0; i < capa; i++) {
            int num = scanner.nextInt();

            heap.Insert(num);
        }

        System.out.println(heap.toString());
        System.out.print("�ִ� �� ���� ���� = ");

        while (!heap.isEmpty()) {
            int num = heap.DeleteMax();
            System.out.print(num + " ");
        }
    }
}