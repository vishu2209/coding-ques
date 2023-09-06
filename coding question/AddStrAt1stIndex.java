public class AddStrAt1stIndex {
    public static void main(String[] args){
        String[] arr={"1","2","pawan sharma","1999"};
        int n = arr.length;

        for(int i=0;i<n;i++){
            arr[0] = "abc";
            System.out.print(arr[i]+" ");
        }
    }
    
}
