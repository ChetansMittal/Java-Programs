package Searching;

public class linearSearch {
    public static void main(String[] args) {
    int[] a = {12,54,12,-2,87,74,45,12,19};
    int target =1909;
        System.out.println(linear(a,target));
    }
    static int linear(int[] arr, int target) {
        if (arr.length == 0) return -1;

        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (element == target) return i;
        }
        return -1;
    }
}
