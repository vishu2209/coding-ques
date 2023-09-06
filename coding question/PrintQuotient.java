import java.util.*;
public class PrintQuotient {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        // int arr[];
        System.out.println("Enter the size if the array");
        int n = sc.nextInt();
        System.out.println("Enter the element in the array");

        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the no. you want to divide:");
        int k = sc.nextInt();
        //int[] arr2 = new int[n];
        System.out.println("Quotients of array are:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]/k+" ");
            
        }

        

    }
}
