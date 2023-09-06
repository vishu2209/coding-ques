// import java.util.*;
import java.util.Scanner;

    public class Que1{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in); // Scanner class is used to take user input
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("* ");

            }
            System.out.println();
        }
    }
}