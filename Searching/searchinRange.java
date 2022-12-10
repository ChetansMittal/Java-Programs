package Searching;

public class searchinRange {
    public static void main(String[] args) {
        int[] a = {12,54,12,-2,87,74,45,12,19};
        int target =87;
        System.out.println(linear(a,3,8,target));
    }
    static int linear(int[] arr, int start , int end ,int target) {
        if (arr.length == 0) return -1;

        for (int i = start; i < end; i++) {
            int element = arr[i];
            if (element == target) return i;
        }
        return -1;
    }
}
