package basic;
import java.util.*;

public class MissingNumber {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        
        int[] arr=new int[n];
        System.out.println("Enter the Element of arrays");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();

        }
        int p=0;
        int q=0;
        
       for(int i=1;i<=n;i++){
           p = p+i;
       }
       for(int i=0;i<n-1;i++){
           q=arr[i]+q;
       }
       int m = p-q;
       System.out.println("Missing element is "+m);
        
    }
    
}
