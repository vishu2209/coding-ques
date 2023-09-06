import java.util.*;

public class CharInDescending {
    public static void main(String[] args){
       char[] arr = {'o','h','O','z','K','q','w','Q'};
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            int min =i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            if(min!=i){
                char temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("character in decreasing order :");
        for(int i=n-1;i>=0;i--){
        System.out.print(arr[i]+" ");
        }
    }
    
}
