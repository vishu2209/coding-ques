import java.util.Scanner;
public class SumOfElementInArray {

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        // int arr[];
        System.out.println("Enter the size if the array");
        int n = sc.nextInt();
        int val =0;

        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            val = arr[i]+val;

        }
        System.out.println(val);
    }
    
}
