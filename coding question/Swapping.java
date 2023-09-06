import java.util.Scanner;

public class Swapping {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        b = b+a;
        a = b-a;
        b = b-a;
        System.out.println(a+" "+b);
    }
    
}
