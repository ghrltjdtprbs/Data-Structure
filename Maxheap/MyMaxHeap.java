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
        // 가장 끝 값을 맨 위로
        Swap(0, size);

        leftPos = getLeftChild(0);
        rightPos = leftPos + 1;

        while (true) {
            int selected = 0;
            // 자식이 없는 경우
            if (leftPos >= size) {
                break;
            }
            // 자식이 하나만 있는 경우
            if (rightPos >= size) {
                selected = leftPos;
            } else {
                // 큰걸 선택
                if (arr[leftPos] < arr[rightPos]) {
                    selected = rightPos;
                } else {
                    selected = leftPos;
                }
            }
            // 선택된 값이 부모보다 크면 교환
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
        String ret = size + "개의 원소 삽입 후 최대 힙 = ";

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

  