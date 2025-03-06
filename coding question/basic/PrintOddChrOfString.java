package basic;
import java.util.*;
public class PrintOddChrOfString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       
        String st = sc.next();
        char[] arr = st.toCharArray();
        int n = arr.length;

        
        
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
