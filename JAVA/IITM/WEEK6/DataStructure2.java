import java.util.*;
public class DataStructure2 {
    public static void main(String[] args) {
        Set <Integer> s1 = new HashSet<>();
        Set <Integer> s2 = new HashSet<>(Arrays.asList(50,15,97,60,21,70,1));
        for(int i = 1;i<=5;i++){
            s1.add(i);
        } // hashset doesnot sort and also doesnot add elements in given order
        System.out.println("HashSet");
        System.out.println("s1: " + s1);
        System.out.println("==============================================================================");

        s1.add(50);s1.add(97); //doesnot allow duplicates 
        System.out.println("s1 after adding duplicates: " +s1);
        System.out.println("==============================================================================");

        s1.addAll(s2);
        System.out.println("s1 and s2 merged together as s1: "+s1);
        System.out.println(s1.contains(50)); //checks if element presents -> boolean return
        System.out.println("==============================================================================");


        Set <Integer> ts1 = new TreeSet<>(s1); // same as hashset but it does sorting
        Set <Integer> ts2 = new TreeSet<>();
        ts2.add(90);ts2.add(50);
        ts2.add(11);ts2.add(77);
        System.out.println("TreeSet");
        System.out.println("ts2: "+ts2);
        System.out.println("==============================================================================");

        ts1.addAll(ts2);
        System.out.println("ts1 after merging ts1 and ts2: "+ts1);
        System.out.println(ts1.contains(100));
        System.out.println("==============================================================================");


        LinkedList <Integer> l = new LinkedList<>(
            Arrays.asList(50,60,66,11,21,27)
        );
        l.addFirst(20);l.addLast(33);l.removeFirst();l.removeLast();

        Queue<Integer> q = new LinkedList<>();
        // q.remove(); //underflow
        System.out.println("Queue");
        System.out.println("q.poll: "+q.poll());
        q.add(50); //could give exception in case of overflow
        q.offer(90); //offers also adds element in queue but it bypass the exception in case of overflow without adding the element 
        q.peek();
        System.err.println("before merging: "+q);
        System.out.println("==============================================================================");
        q.addAll(l);
        System.err.println("after merging: "+q);
        System.out.println("==============================================================================");
        q.offer(600);
        q.poll(); //it is same as remoove but does not give exception in case of underflow
        System.out.println("after last poll: "+q);
        System.out.println("==============================================================================");
        q.remove(); // remove from 1st position
        System.out.println("after last remove: "+q);
        System.out.println("==============================================================================");

        // Priority queue : Heap
        PriorityQueue <Integer> pri_q1 =new PriorityQueue<>(l);
        PriorityQueue <Integer> pri_q2 =new PriorityQueue<>();
        
        System.out.println("pri_q1: "+pri_q1);
        System.out.println("==============================================================================");

        pri_q2.add(22);pri_q2.add(9);pri_q2.add(100);
        System.out.println("pri_q2: "+pri_q2);
        System.out.println("==============================================================================");
        System.out.println("peek: "+pri_q2.peek());
        while (!pri_q2.isEmpty()) {
            System.out.print(pri_q2.poll()+", ");
        }
        System.out.println("\n==============================================================================");
















    }
}
