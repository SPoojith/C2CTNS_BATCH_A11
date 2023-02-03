package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;
import java.util.List;
class comp implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        // TODO Auto-generated method stub
        Integer a1=(Integer)o1;
        Integer a2=(Integer)o2;
        if(a1.equals(a2)){
            return 0;
        }else{
            return -a1.compareTo(a2);
        }  
    }

}

public class hashset {
    public static void main(String[] args) {
        comp c=new comp();
        List<Integer> h=new ArrayList();
        h.add(10);
        h.add(11);
        h.add(12);
        h.add(13);
        h.add(14);
        h.add(15);
        System.out.println(h);
        Collections.sort(h, c);
        System.out.println(h);
        
        
    }
    
}
