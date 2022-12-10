package Binary_Search_Questions;
//https://leetcode.com/problems/find-in-mountain-array/description/
public class SearchInMountain {
    public static void main(String[] args) {

    }

    int search(int[] arr, int target) {
        int peak = peakIndexInMountainArray(arr);
        int firsttry = binary(arr, target, 0, peak);
        if (firsttry != -1) {
            return firsttry;
        }
        return binary(arr, target, peak + 1, arr.length - 1);
    }

    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                // this may be the ans but look at left as your are in dec part of aary
                //
                end = mid;
            }
            //your are in asc aprt of array
            else start = mid + 1;
        }
        return start;
    }

    static int binary(int[] arr, int target, int start, int end) {

        boolean isAsc = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else start = mid + 1;

            } else {
                if (target > arr[mid]) {
                    start = mid + 1;
                } else end = mid - 1;
            }
        }
        return -1;
    }
}
