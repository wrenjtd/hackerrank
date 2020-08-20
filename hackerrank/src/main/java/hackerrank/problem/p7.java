package hackerrank.problem;

public class p7 {
    
    static long aVeryBigSum(long[] ar) {
        long total = 0;

        for(int i = 0; i< ar.length; i++){
            total+= ar[i];
        }

        return total;

    }

    public static void main(String[] args) {
        long [] ar = {1000000001, 1000000002, 1000000003, 1000000004, 1000000005};

        
        System.err.println(aVeryBigSum(ar));
    }
}