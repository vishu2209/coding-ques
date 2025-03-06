package basic;
public class StringToChar {
    public static void main(String[] args){
        String str = "Vishal";
        char[] arr = str.toCharArray();
        int n = arr.length;
        for(int i=0; i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
