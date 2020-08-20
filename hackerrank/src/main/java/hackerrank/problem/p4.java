package hackerrank.problem;

public class p4 {


    public static int fibNth(int number){
        int fibNum;
        if(number == 0) return 0;
        else if(number==1) return 1;
        else{
            return fibNth(number - 1) + fibNth(number - 2);
        }
    }

    public static void main(String[] args) {
        int number = 10;
        System.out.println(fibNth(number));
        
    }
}