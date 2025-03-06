package basic;
import java.util.Scanner;

public class RemoveChrPresentIn2ndString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str2 =sc.nextLine();
        String str1 = sc.nextLine();
        String val = "";
        for(int i = 0;i<str1.length();i++){
            char ch = str1.charAt(i);
            if(str2.indexOf(ch)==-1){
                val = val+ch;

            }

        }
        System.out.println(val);

    }
    
}
