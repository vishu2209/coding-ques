import java.util.HashMap;
import java.util.Map;

public class OccuranceOfChr {
    public static void main(String[] args){
        Map<Character, Integer> map = new HashMap();
        String str = "Hello";
        char[] chr = str.toCharArray();
        for(char ch : chr){
            if(!map.containsKey(ch)){
                map.put(ch, 1);
            }else{
                int value = map.get(ch);
                map.put(ch, value+1);

            }
        }
        System.out.println(map);
    }
    
}
