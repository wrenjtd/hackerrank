package hackerrank.problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class p8revised {
    public static int diagonalDifference(List<List<Integer>> arr, int num) {
        
        int total = 0;
        int sum1 = 0;
        int sum2 = 0;
        String [] sArray = new String [num];
        for(int i = 0; i < num; i++){
            int [] iArray = arr.get(i).stream().mapToInt(a->a).toArray();
            sArray = Arrays.stream(iArray).mapToObj(String::valueOf).toArray(String[]::new);
            sum1 = sum1 + Integer.parseInt(sArray[i]);
            
            sum2 = sum2 + Integer.parseInt(sArray[num-1-i]);
        }

        

        total = Math.abs(sum1 - sum2);
        return total;

    }


    public static void main(String[] args) {
        int num = 3;
        List<List<Integer>> arr = new ArrayList<>();
        arr.add(new ArrayList<>(Arrays.asList(11, 2, 4)));
        arr.add(new ArrayList<>(Arrays.asList(4, 5, 6)));
        arr.add(new ArrayList<>(Arrays.asList(10, 8, -12)));
        
        System.out.println(diagonalDifference(arr, num));
       



    }
}