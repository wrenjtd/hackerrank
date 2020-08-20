package hackerrank.problem;

public class p2 {
    
    public static void countby(int number){
        for(int i = 1; i <= number; i++ ){
           for(int j = 1; j <= number; j++){
                System.out.print(i*j + " ");
           }
           System.out.println("");
        }
    }

    public static void main(String[] args) {
        int number = 10;

        countby(number);
    }


}