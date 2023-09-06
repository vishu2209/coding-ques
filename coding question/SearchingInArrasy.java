import java.util.Scanner;

public class SearchingInArrasy {
    public static void main(String[] vishal){
        System.out.println("Enter the size of array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //int [5] arr = {1,2,3,4,5};
        int arr [] =new int[n];
        System.out.println("Enter the element in array :");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("elements of array are following :");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("Enter the element that you have to find :");
        int m = sc.nextInt();
        int p=0;
        for(int i=0;i<n;i++){
            if(arr[i]==m){
                p =i;
                break;
            }else{
                p =-1;
            }
            
        }if(p !=- 1){
             System.out.println("valuse is present at index of "+p);
        }else{
            System.out.println("Given value is out of array.");
        }

        
       
        }
    }
    

