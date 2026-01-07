package org.example;
public class Main{
    public static void merge(int[] arr, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        int left = low;
        int right = mid + 1;
        int k = 0;
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp[k++] = arr[left++];
            } else {
                temp[k++] = arr[right++];
            }
        }
        while (left <= mid) {
            temp[k++] = arr[left++];
        }
        while (right <= high) {
            temp[k++] = arr[right++];
        }
        for (int i = 0; i < temp.length; i++) {
            arr[low+i] = temp[i];
        }
    }

    public static void mergesort(int[] arr, int low, int high) {
        if (low >= high) return;
        int mid = (low + high) / 2;
        mergesort(arr, low, mid);
        mergesort(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }

    public static void main(String[] args) {
        int[] arr ={1, 4, 5, 2, 7, 3, 6};
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        mergesort(arr,0,arr.length-1);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
