import java.util.HashMap;
import java.util.Map;

public class count {
    public static void main(String[] args) {
        String a = "cool";
        HashMap<Character,Integer>hashMap=new HashMap<>();
        for (int i =0;i<a.length();i++){
            if(hashMap.containsKey(a.charAt(i))){
                int count =hashMap.get(a.charAt(i));
                hashMap.put(a.charAt(i),count+1);
            }else {
                hashMap.put(a.charAt(i),1);
            }
        }
        for (Map.Entry<Character,Integer>map:hashMap.entrySet()){
            System.out.println("occurrence of character  "+map.getKey()+"  is "+map.getValue());
        }
    }
}
