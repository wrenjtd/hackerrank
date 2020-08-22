package hackerrank.problem;

import java.util.Scanner;

public class p9revised {
    

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        float pos=0,neg=0,z=0,num=0;
        for(int i = 0;i<n;i++) {
            num = in.nextFloat();
            if(num > 0) pos++;
            else if(num < 0) neg++;
            else if(num == 0) z++;
        }
        System.out.println(String.format("%.6f", pos/n));
        System.out.println(String.format("%.6f",neg/n));
        System.out.println(String.format("%.6f",z/n));
    }
}