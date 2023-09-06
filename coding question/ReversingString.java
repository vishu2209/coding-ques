import java.util.Scanner;

public class ReversingString {
    public static void main(String[] args){

        System.out.println("Enter the String to reverse it :");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = str.length();
        char [] chr = str.toCharArray();
        System.out.println("String After reversing :");
        for(int i=n-1; i>=0;i--){
            System.out.print(chr[i]);

        }
        System.out.println();

        StringBuffer sb = new StringBuffer(str);
        System.out.println(sb.reverse());


    }
    
}
