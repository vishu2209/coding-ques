import java.util.Scanner;

public class InputArrayOfString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        sc.nextLine();
        String[] arr = new String[n];
        System.out.println("Enter the element off array:");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextLine();
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
    
}
