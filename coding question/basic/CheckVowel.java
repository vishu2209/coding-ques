package basic;
import java.util.Scanner;

public class CheckVowel {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        for(int i= 0;i<str.length()-1;i++){
            char ch = str.charAt(i);
            if(ch=='a'|| ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U'){
                System.out.println(ch);
            }
        }

    }
    
}
