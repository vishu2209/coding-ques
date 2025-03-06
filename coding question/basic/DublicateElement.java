package basic;
import java.util.*;

public class DublicateElement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the element of array:");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int val=0;
        Arrays.sort(arr);
        System.out.println("Duplicate elements are:- ");
        for(int i=0;i<n-1;i++){
            if(arr[i]==arr[i+1]){
                val = arr[i];
                System.out.println(val);

            }
        }
        
        }
    
}
