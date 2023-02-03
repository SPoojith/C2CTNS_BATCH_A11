package collections;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class ques{
    public static void main(String[] args) {
        ques c=new ques();
        Queue<Integer> q=new PriorityQueue<Integer>();
        //q.add(null)
        q.offer(10);
        q.add(1);
        q.add(2);
        q.add(4);
        q.add(9);
        q.add(5);
        q.add(6);
        System.out.println(q);
    }

    
    
}
