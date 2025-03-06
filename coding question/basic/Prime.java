package basic;
import java.util.Scanner;

public class Prime {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        boolean isPrime = true;
        if(n<2){
            System.out.println("no prime:");
        }else{
            for(int i =2;i<n;i++){
                if(n%i==0){
                    isPrime = false;
                }
            }
            if(isPrime){
                System.out.println("Given value is prime no.");
            }else{
                System.out.println("Given is not prime no.");
            }
        
        }

    }
    
}
