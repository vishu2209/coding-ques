import java.util.Scanner;

public class PrintOddChrFirst {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        sc.nextLine();
        char[] arr = new char[n];
        System.out.println("Enter the characters");
        for(int i=0;i<n;i++){
            arr[i] = sc.next().charAt(0);
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
            i++;
        }
        for(int i=1;i<n;i++){
            System.out.print(arr[i]+" ");
            i++;
        }

    }
    
}
