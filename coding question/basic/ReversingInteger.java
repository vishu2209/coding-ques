package basic;
public class ReversingInteger {
    public static void main(String [] args){
        int num = 123;
        String str = String.valueOf(num);
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        System.out.println(sb);

    }
    
}
