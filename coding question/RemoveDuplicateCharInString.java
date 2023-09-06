import java.util.*;
public class RemoveDuplicateCharInString {
    public static void main(String [] args){
        System.out.println("Enter the String :");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] chr = str.toCharArray();
        String val = "";
        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            if(val.indexOf(ch)==-1){
                val = val+ch;

            }
        }
        System.out.println(val);

    }
    
}
