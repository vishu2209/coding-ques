package basic;
import java.util.*;
public class AlternateElementInArray {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        // int arr[];
        
        System.out.println("Enter the size if the array");
        int n = sc.nextInt();
        System.out.println("Enter the element of array");
        

        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        
        }
        for(int j=0;j<n;j++){
            
            
           
                System.out.print(arr[j]+" ");
                j++;

                
            

        }
       
    }
    
}
