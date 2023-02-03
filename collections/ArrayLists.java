package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<>();
       // System.out.println(a);
       a.add(20);
       a.add(19);
       a.add(18);
       a.add(17);
       a.add(16);
       System.out.println("befor "+a);
       Collections.sort(a);
        System.out.println("after"+a);
    }    
}
