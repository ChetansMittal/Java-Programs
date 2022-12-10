package Binary_Search_Questions;

public class ceiling_number {
    public static void main(String[] args) {
        int[] arr={2,3,5,9,14,16,18};

        System.out.println(ceiling(arr, 15));
    }
    static int ceiling(int[] arr, int ceil){
        int start = 0;
        int end = arr.length-1;

        while(start<= end){
           int mid = start + (end-start)/2;

            if(arr[mid]==ceil){
                return arr[mid];
            }
            if(arr[mid]>ceil){
                end = mid-1;
            }
            else start= mid+1;
        }
        return arr[start];
    }
}
