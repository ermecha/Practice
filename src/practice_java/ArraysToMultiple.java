package practice_java;

import java.util.Arrays;

public class ArraysToMultiple {
    public static void main(String[] args) {


        int[][] arr = {
                {1, 2, 3},
                {2, 3, 4},
                {3, 4, 5}
        };
        int[][] arr2 = {
                {6, 5, 3},
                {8, 4, 5},
                {7, 8, 5}
        };
        int [][] res=new int[arr.length][];
        for(int i=0;i<arr.length;i++){
            int[]tempo=new int[arr[0].length];

            for(int j=0;j<arr[i].length;j++){
                tempo [j]=arr[i][j]*arr2[i][j];

            }
            res[i]=tempo;
        }
        System.out.println(Arrays.deepToString(res));
    }

}
