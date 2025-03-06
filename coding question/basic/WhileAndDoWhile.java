package basic;
import java.util.Scanner;

public class WhileAndDoWhile {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr =new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int i=0;
        while(i<n){
            System.out.print(arr[i]+" ");
            i++;
        }
        System.out.println();
        int j=0;
        do{
            System.out.print(arr[j]+" ");
            j++;
        }while(j<n);

    }
    
}
