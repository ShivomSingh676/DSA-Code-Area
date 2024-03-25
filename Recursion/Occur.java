package Recursion;

public class Occur {
    public static int firstOccur(int arr[], int key, int i) {
        if (i == arr.length - 1)
            return -1;
        if (arr[i] == key)
            return i;
        return firstOccur(arr, key, ++i);
    }

    public static void main(String[] args) {
        int arr[] = { 8, 3, 6, 9, 5, 10, 2, 5, 3 };
        System.out.println(firstOccur(arr, 5, 5));
    }
}
