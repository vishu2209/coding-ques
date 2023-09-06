import java.util.Scanner;

public class PrintNPrimeNo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        /**
         * 
         * n =10 
         * n=2,3,4,5,6,7,8,9,10
         * boolean prime = true
         * i=2, 2<=10,
         * j=2 2<2
         * j=3 3<2
         * i=3 , 3<=10
         * j=2
         *2<3
         3%2==0
         3<3
         i=4
         j=2
         2<4
         4%2==0
         prime =true
         
         */
        int n = sc.nextInt();
        
        if(n==0){
            System.out.print("no prime no.");
        }else if(n==1){
            System.out.print("1");
        }else{
            System.out.print("1 ");
            
        for(int i=2;i<=n;i++){
            boolean prime = true;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    prime = false;
                    break;
                }
            }
            if(prime){
                System.out.print(i+" ");
            }
        }
    }
    }
    
}
