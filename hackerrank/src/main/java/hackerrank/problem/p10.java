package hackerrank.problem;

public class p10 {
    
    static void addsTo(int [] iArray, int index, int num, int reducedNum){

        if(reducedNum < 0) return;

        if(reducedNum == 0){

            for(int i = 0; i < index; i++)
                    System.out.print(iArray[i] + " ");
                System.out.println();
            return;    
            
        }

        int prev = (index == 0) ? 1 : iArray[index - 1];

        for(int k = prev; k <= num; k++){

            iArray[index] = k;

            addsTo(iArray, index + 1, num, reducedNum - k);
        }
    }


    static void addsTo(int num){

        int [] iArray = new int [num];
        addsTo(iArray, 0, num, num);
    }

    
    public static void main(String[] args) {
        int num = 10;
        addsTo(num);
    }
}