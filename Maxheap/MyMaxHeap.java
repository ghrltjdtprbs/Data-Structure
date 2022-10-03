package hw9_1;

import java.util.Scanner;

public class MyMaxHeap {
    private int[] arr;
    private int capacity;
    private int size;


    public MyMaxHeap(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
    }

    public void Insert(int data) {
        if (size >= capacity) {
            return;
        }

        int curPos = size;
        int parentIndex = getParent(curPos);

        arr[curPos] = data;

        
        while (curPos > 0 && arr[curPos] > arr[parentIndex]) {
            Swap(curPos, parentIndex);

            curPos = parentIndex;
            parentIndex = getParent(curPos);
        }

        size++;
    }

    public int DeleteMax() {
        if (size == 0) {
            return -1;
        }

        int parentPos = 0;
        int leftPos = 0;
        int rightPos = 0;

        size--;
        // ���� �� ���� �� ����
        Swap(0, size);

        leftPos = getLeftChild(0);
        rightPos = leftPos + 1;

        while (true) {
            int selected = 0;
            // �ڽ��� ���� ���
            if (leftPos >= size) {
                break;
            }
            // �ڽ��� �ϳ��� �ִ� ���
            if (rightPos >= size) {
                selected = leftPos;
            } else {
                // ū�� ����
                if (arr[leftPos] < arr[rightPos]) {
                    selected = rightPos;
                } else {
                    selected = leftPos;
                }
            }
            // ���õ� ���� �θ𺸴� ũ�� ��ȯ
            if (arr[selected] > arr[parentPos]) {
                Swap(parentPos, selected);
                parentPos = selected;
            } else {
                break;
            }

            leftPos = getLeftChild(parentPos);
            rightPos = leftPos + 1;
        }

        return arr[size];
    }

    private void Swap(int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

    private int getParent(int index) {
        return (int) ((index - 1) / 2);
    }

    private int getLeftChild(int index) {
        return 2 * index + 1;
    }

    @Override
    public String toString() {
        String ret = size + "���� ���� ���� �� �ִ� �� = ";

        for (int i = 0; i < size; i++) {
            ret += arr[i];
            ret += " ";
        }

        return ret;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}

  