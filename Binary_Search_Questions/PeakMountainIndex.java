package Binary_Search_Questions;
//https://leetcode.com/problems/peak-index-in-a-mountain-array/
public class PeakMountainIndex {
    public static void main(String[] args) {

    }
    public int peakIndexInMountainArray(int[] arr) {
        int start =0;
        int end = arr.length-1;

        while(start < end){
            int mid = start + (end-start)/2;

            if(arr[mid]>arr[mid+1]){
                // this may be the ans but look at left as your are in dec part of aary
                //
                end = mid;
            }
            //your are in asc aprt of array
            else start = mid+1;
        }
        return start;
    }
}
