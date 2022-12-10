package Searching;

public class SortedMatrix {
    public static void main(String[] args) {

    }
    //search in the row provided
    static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target){
        while(cStart<cEnd){
            int mid = cStart + (cEnd - cStart )/2;
            if(matrix[row][mid]==target){
                return new int[]{row,mid};
            }
            if(matrix[row][mid]>target){
                cEnd = mid-1;
            }
            else cStart = mid + 1;
        }
        return new int[]{-1,-1};
    }
    static int[] search(int[][] matrix, int target){
        int rows = matrix.length;
        int cols =  matrix[0].length;

        if (rows==1){
                return binarySearch(matrix, 0 , 0 , -1,target);
        }
        int rStart=0;
        int rEnd = rows-1;
        int cMid = cols/2;
        //run the loop till 2 are remaining
        while(rStart< (rEnd-1)){
            int mid = rStart + (rEnd-rStart)/2;
            if(matrix[mid][cMid]==target){
                return new int[]{mid,cMid};
            }
            if(matrix[mid][cMid]<target){
                rStart=mid;
            }
            else rEnd=mid;
        }
        //check whether the target is in th column of 2 rwos
        if(matrix[rStart][cMid]==target){
            return new int[]{rStart,cMid};
        }
        if(matrix[rStart+1][cMid]==target){
            return new int[]{rStart+1,cMid};
        }
        //search in 1st half
        //search in 2nd half
        //search in 3rd half
        //search in 4th half

        return new int[]{-1,-1};
    }
}
