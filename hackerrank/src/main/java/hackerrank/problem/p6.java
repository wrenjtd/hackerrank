package hackerrank.problem;

import java.util.ArrayList;
import java.util.List;

public class p6 {
    
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
            
            int alice = 0;
            int bob = 0;
            int [] aArray = a.stream().mapToInt(i->i).toArray();
            int [] bArray = b.stream().mapToInt(i->i).toArray();
            List<Integer> pointsList = new ArrayList<>();

            for(int i = 0 ; i < aArray.length; i++){
                if(aArray[i] > bArray[i]){
                    alice++;
                }
                else if(bArray[i]> aArray[i]){
                    bob++;
                }
                else{
                    alice += 0;
                    bob +=0;
                }

            }
            pointsList.add(alice);
            pointsList.add(bob);
            return pointsList;

    }


    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();

        a.add(17);
        a.add(28);
        a.add(30);
        
        b.add(99);
        b.add(16);
        b.add(8);

        System.out.println(compareTriplets(a, b));


    }
}