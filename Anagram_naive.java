import java.util.Scanner;
import java.util.Arrays;
public class Anagram_naive{
    public static boolean anagram(String s1,String s2){
        char[] S1=s1.toCharArray();
        char[] S2=s2.toCharArray();
        Arrays.sort(S1);
        Arrays.sort(S2);
        
        return Arrays.equals(S1,S2);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String 1:");
        String S1=sc.next();
        System.out.println("Enter the String 2:");
        String S2=sc.next();
        System.out.println(anagram(S1,S2));
        sc.close();
    }
}