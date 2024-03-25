package Recursion;

public class LOccur {
    public static int lastOccur(int arr[], int key, int i) {
        if (i == arr.length)
            return -1;
        int isFound = lastOccur(arr, key, i + 1);
        if (isFound == -1 && arr[i] == key)
            return i;
        return isFound;
    }

    public static void main(String[] args) {
        int arr[] = { 8, 6, 5, 10, 5, 6, 7, 3, 6, 3, 7, 9, 0, 5, 3, 2, 5, 7, 4, 5, 6, 7, 8};
        System.out.println(lastOccur(arr, 5, 0));
    }
}
