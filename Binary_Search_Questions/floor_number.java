package Binary_Search_Questions;

public class floor_number {
    public static void main(String[] args) {
        int[] arr={2,3,5,9,14,16,18};

        System.out.println(floor(arr, 15));
    }
    static int floor(int[] arr, int floor){
        int start = 0;
        int end = arr.length-1;

        while(start<= end){
            int mid = start + (end-start)/2;

            if(arr[mid]==floor){
                return arr[mid];
            }
            if(arr[mid]>floor){
                end = mid-1;
            }
            else start= mid+1;
        }
        return arr[end];
    }
}
