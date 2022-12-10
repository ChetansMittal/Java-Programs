package Searching;

public class minimum_element {
    public static void main(String[] args) {
        int[] arr ={12,45,41,45,78,851,35,25};
        int min=arr[0];

        for(int i=0;i<arr.length;i++){
            if(arr[i]<min)
                min = arr[i];
        }
        System.out.println("The minimum element is : " + min);
    }
}
