package org.example;

public class BubbleSort {

    /**
     * Sắp xếp mảng Integer theo thứ tự tăng dần bằng Bubble Sort.
     * Trả về một mảng mới đã được sắp xếp (mảng đầu vào không bị thay đổi).
     */
    public Integer[] sort(Integer[] input) {
        Integer[] a = input.clone();
        int n = a.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    // swap(a[j], a[j+1])
                    Integer temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        return a;
    }
}