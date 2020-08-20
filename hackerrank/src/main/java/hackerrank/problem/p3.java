package hackerrank.problem;

public class p3 {
    
    public static char nonRepeat(String word){
        int index = 0;
        char first = word.charAt(index);

        
        for(int i = 0; i < word.length(); i++ ){
            
            for(int j = i+1 ; j < word.length(); j++){
                if(first == word.charAt(j)){
                    index++;
                    first = word.charAt(index);
                }
                
            }
        }
        return first;
    }
    public static void main(String[] args) {
        String myString = "adzbdcab";
        System.out.println(nonRepeat(myString));
        
    }
}