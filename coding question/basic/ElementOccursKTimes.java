package basic;
import java.util.*;

public class ElementOccursKTimes {
    public static void main(String[] args) {
        int val=0;
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Enter the value of k: ");
        int k = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
                if (count > k) {
                    break;
                }
            }
            if (count == k) {
                val=arr[i];

            }
        }  
        System.out.println(val);
        
    }
}
