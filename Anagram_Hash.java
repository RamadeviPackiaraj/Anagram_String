import java.util.Scanner;
import java.util.HashMap;
public class Anagram_Hash{
    static boolean areAnagrams(String s1,String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        
        HashMap<Character,Integer> charCount=new HashMap<>();
        
        for(char ch:s1.toCharArray()){
            charCount.put(ch,charCount.getOrDefault(ch,0)+1);
        }
        
        for(char ch:s2.toCharArray()){
            if(!charCount.containsKey(ch)){
                return false;
            }
            charCount.put(ch,charCount.get(ch)-1);
            if(charCount.get(ch)==0){
                charCount.remove(ch);
            }
                
            }
            return charCount.isEmpty();
        }
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter String 1:");
            String s1=sc.next();
            System.out.println("Enter String 2:");
            String s2=sc.next();
            System.out.println(areAnagrams(s1,s2));
        sc.close();
            
        }
}