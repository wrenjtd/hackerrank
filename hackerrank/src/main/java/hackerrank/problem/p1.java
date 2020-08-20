package hackerrank.problem;

import java.util.HashMap;

class hmCounter{
    int count;
    int index;

    public hmCounter(int index){
        index = this.index;
        count = 1;
    }

    public void counter(){
        count++;
    }
}

public class p1 {

   


    public static void countFunction(String myString, int subString){
        HashMap<Character, hmCounter> letterCount = new HashMap<>();
       
        for(int i = 0; i < myString.length(); i++){
            if(letterCount.containsKey(myString.charAt(i))){
                letterCount.get(myString.charAt(i)).counter();
            }
            else{
                letterCount.put(myString.charAt(i), new hmCounter(i));
            }
        }
        System.out.println("The word " + myString + " has " + letterCount.get(myString.charAt(subString)).count + " "+ myString.charAt(subString)+"'s");
    }

    public static void main(String[] args) {
        
        String myString = "Hippopotamus";
        int subString = 2;
        countFunction(myString, subString);
    }
}