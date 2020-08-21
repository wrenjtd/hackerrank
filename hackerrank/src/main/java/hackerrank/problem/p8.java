package hackerrank.problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class p8 {
    
    public static int diagonalDifference(List<List<Integer>> arr) {
        
        int total = 0;

        for(int i = 0; i < arr.size(); i++){

        }

        int first = arr.get(0).get(0);
        int second = arr.get(1).get(1);
        int third = arr.get(2).get(2);
        int sum1 = first + second + third; 
        
        
        int first2 = arr.get(0).get(2);
        int second2 = arr.get(1).get(1);
        int third2 = arr.get(2).get(0);
        int sum2 = first2 + second2 + third2;

        total = Math.abs(sum1 - sum2);

        return total;

    }

    public static int diagonalDifference(int arr) {
        System.out.println(arr);
        return 1;
    }

    public static void main(String[] args) {

        List<List<Integer>> arr = new ArrayList<>();
        arr.add(new ArrayList<>(Arrays.asList(11, 2, 4)));
        arr.add(new ArrayList<>(Arrays.asList(4, 5, 6)));
        arr.add(new ArrayList<>(Arrays.asList(10, 8, -12)));
        
        System.out.println(diagonalDifference(arr));
       



    }
}