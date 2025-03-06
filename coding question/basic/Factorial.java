package basic;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        int fact=1;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>=0){
            for(int i=1;i<=n;i++){
                fact = fact*i;
            }
            System.out.println(fact+" is the factorial of "+ n);
        }else{
            System.out.println("Input must be +ve");
        }
        
    }
    
}
