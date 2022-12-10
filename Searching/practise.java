package Searching;

public class practise {
    public static void main(String[] args) {
        int[] arr = {2,3,5,10,15,20,45,48,57,85,99};
        int target = 45;
        System.out.println(binary(arr, target));
    }
    static int binary(int[] arr, int target){
        int start =0 ;
        int end = arr.length -1;

        while(start < end ){
            int mid = start + (end-start)/2;
            if (target<arr[mid]){
                end = mid -1;
            }
            else if (target > arr[mid]){
                start= mid +1;
            }
            else return mid;

        }
        return -1;
    }
}
