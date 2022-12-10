package Searching;

import java.util.Arrays;

public class Search_in_2D {
    public static void main(String[] args) {
        int[][] arr={
                {23,4,1},
                {18,12,3,9},
                {78,99,34,12},
                {18,12}
        };
        int target =99;
        int[] ans = search(arr,target);
        System.out.println(Arrays.toString(ans));
        System.out.println("The Maximum value int the array is :"+  max(arr));
    }
    static int[] search(int[][] arr, int tar){
        for(int row=0; row< arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]== tar){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }

    static int max(int[][] arr){
        int max= Integer.MIN_VALUE;
        for (int[] ints : arr) {
            for (int anInt : ints) {
                if (anInt > max) {
                    max = anInt;

                }
            }
        }
        return max;
    }

}
