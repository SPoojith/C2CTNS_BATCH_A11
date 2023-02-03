package collections;

import java.util.HashMap;

public class maps {
    public static void main(String[] args) {
        HashMap<Integer,String> map=new HashMap<>();
        map.put(101, "poojith");
        map.put(102,"aish");
        map.put(103,"kulli");
       for(Integer i:map.keySet()){
        System.out.println(map.get(i));
       }
    }
    
}
