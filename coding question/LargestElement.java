import java.util.Scanner;
public class LargestElement{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        // int arr[];
        System.out.println("Enter the size if the array");
        int n = sc.nextInt();
        System.out.println("Enter the element in the array");

        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
//n = 5
            //arr[0] =5
            //arr[1] = 6
//arr[2] =  2
//arr[3]  = 7
//arr[4] = 4
//arr = {5,6,2,7,4}
       //0,1,2,3,4
        }
        int val =  0;
        //val=0
        for(int i=0;i<n;i++){
            if(arr[i]>val){
                //i=0
                //arr[0]=5
                //5>0
                //val = 5
                //i=1
                //arr[1]=6
                //6>val(5)
                //val =6
                //i = 2
                //arr[2] = 2
                //2>6
                //i= 3
                //arr[3]=7
                //7>6
                //val 7
                //i = 4
                //arr[4] = 4
                //4>val(7)
                //i=5
                //5<n(5)
                //val =7
                val = arr[i];
            }
            

        }
        System.out.println(val+" is the greatest element in the array");
    }
}