package basic;
import java.util.Scanner;

public class PrintSpecialChr {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        char[] arr = new char[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.next().charAt(0);
        }

        for(int i=0;i<n;i++){
            char val = arr[i];
            if((val >=32 && val<=47) || (val>=58 && val<=64) || (val>=91 && val<=96) || (val>=123 && val<=126) ){

                System.out.print(val+" ");
            }
        }

    }
    
}
