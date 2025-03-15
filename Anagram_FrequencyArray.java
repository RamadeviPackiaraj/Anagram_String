import java.util.Scanner;
import java.util.Arrays;
public class Anagram_FrequencyArray{
    static final int MAX_CHAR=26;
    static boolean areAnagrams(String s1,String s2){
        int[] freq=new int[MAX_CHAR];
        for(int i=0;i<s1.length();i++)
        freq[s1.charAt(i)-'a']++;
        for(int i=0;i<s2.length();i++)
        freq[s2.charAt(i)-'a']--;
        for(int count:freq){
            if(count!=0)
            return false;
     // this will count the distance from a=97 aski value is 97     
        }
        return true;
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