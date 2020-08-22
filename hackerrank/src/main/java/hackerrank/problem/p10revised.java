package hackerrank.problem;

import java.util.ArrayList;




public class p10revised {
    
    static void printList(ArrayList<Integer> iList){
        for(int value: iList){
            System.out.print(value);
        }
        System.out.println();
    }
    
    static void addsTo(int index, int num, ArrayList<Integer> iList){
        if(num == 0) printList(iList);

        for(int j = index; j <= num; j++){
            iList.add(j);
            addsTo(j, num-j, iList);
            iList.remove(iList.size() - 1);
        }
    }

    public static void main(String[] args) {
        
        int num = 5;
        ArrayList<Integer> iList = new ArrayList<>();
        
    
        
        addsTo(1, num, iList);
    }
}