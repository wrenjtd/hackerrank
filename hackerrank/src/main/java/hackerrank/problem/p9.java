package hackerrank.problem;

public class p9 {
    

    public static void plusMinus(int [] arr, int num){
        int positive = 0;
        double pRatio = 0.0;
        int negative = 0;
        double nRatio = 0.0;
        int zero = 0;
        double zRatio = 0.0;
        
        for(int value : arr){
            if(value < 0){
                negative++;
            }
            else if(value > 0){
                positive++;
            }
            else if(value == 0){
                zero++;
            }
        }
        
        pRatio = (double)positive / num;
        System.out.println(String.format("%.6f", pRatio));
        nRatio = (double)negative / num;
        System.out.println(String.format("%.6f", nRatio));
        zRatio = (double)zero / num;
        System.out.println(String.format("%.6f", zRatio));


    }


    public static void main(String[] args) {

        
        int [] arr = {-4 , 3, - 9, 0, 4, 1};
        int num = arr.length;
        plusMinus(arr, num);

    }
}