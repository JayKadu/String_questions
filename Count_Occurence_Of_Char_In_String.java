//method 1: using counter array
import java.util.*;
class Main {
    public static void main(String[] args){
        String str="JohnCena";
        int i;
        int len=str.length();
        int counter[] = new int[256];
        for(i=0;i<len;i++){
            counter[(int)str.charAt(i)]++;
        }
        for(i=0;i<256;i++){
            if(counter[i]!=0){
                System.out.println((char)i+ "="+ counter[i]);
            }   
        }
    }
}

//method 2: using HashMap
import java.util.*;
class Main {
    public static void occur(char[] charArray) {
        Map<Character, Integer> mp = new HashMap<>();
        for(Character c: charArray){
            mp.put(c,mp.getOrDefault(c,0)+1);
        }
        for(Map.Entry<Character, Integer> entry: mp.entrySet()){
            System.out.println(entry);
        }
    }
    public static void main(String[] args){
        String str="JohnCena";
        char[] charArray = str.toCharArray();
        occur(charArray);
    }
}
