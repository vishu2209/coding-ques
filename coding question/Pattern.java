import java.util.*;
public class Pattern {
    public static void main(String[] args){
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        int val=0;
        int num=0;

        for(int i=1;i<=4;i++){
            for(int j=1;j<=4-i;j++){
                
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                val = val+1;
                num = 3*val;
                
                System.out.print(num+" ");


            }
            System.out.println();
        }
        
        
    }
    
}
