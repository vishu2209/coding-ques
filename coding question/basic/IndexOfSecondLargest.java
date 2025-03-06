package basic;
import java.util.*;

public class IndexOfSecondLargest {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int i;
        for(i=0;i<n;i++){

            arr[i] = sc.nextInt();
            
        }
        int val = 0;
        int index = 0;
        // int k;
        // for(int j=1;j<=2;j++){
            for(int k=0;k<n;k++){
                if(arr[k]>val){
                    val = arr[k];
                    
                       // index = k;
                }

            }
                
                for(int k=0;k<n;k++){
                    if(arr[k]==val){
                        arr[k]=0;
                    }
                }
           
                int max=0;
                for(int k=0;k<n;k++){
                    if(arr[k]>max){
                        max =arr[k];
                    }
                }
                System.out.println("***************");
                System.out.println(max);
            // }
          

        }
        // System.out.println(val);

       

    }

