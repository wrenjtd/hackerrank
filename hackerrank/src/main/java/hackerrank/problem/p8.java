package hackerrank.problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class p8 {
    
    public static int diagonalDifference(List<List<Integer>> arr) {
        Scanner scanned = new Scanner(System.in);
        int n;
        n = Integer.parseInt(scanned.nextLine());
        
        int total = 0;
        int sum1 = 0;
        int sum2 = 0;
        for(int i = 0; i < n; i++){
            String str[] = scanned.nextLine().split(" ");
            sum1 = sum1 + Integer.parseInt(str[i]);
            
            sum2 = sum2 + Integer.parseInt(str[n-1-i]);
        }

        

        total = Math.abs(sum1 - sum2);
        return total;

    }


    public static void main(String[] args) {

        List<List<Integer>> arr = new ArrayList<>();
        arr.add(new ArrayList<>(Arrays.asList(11, 2, 4)));
        arr.add(new ArrayList<>(Arrays.asList(4, 5, 6)));
        arr.add(new ArrayList<>(Arrays.asList(10, 8, -12)));
        
        System.out.println(diagonalDifference(arr));
       



    }
}