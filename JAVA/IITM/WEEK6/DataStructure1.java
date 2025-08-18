import java.util.*;


public class DataStructure1 {
    public static void main(String[] args) {
        List<Integer> alist = new ArrayList<>();
        for (int i = 0 ; i <=10; i++){
            alist.add(i);
        }
        System.out.println("Array List : ");
        for (int i =0;i<alist.size();i++) {
            System.out.print(alist.get(i)+", ");
        }
        System.out.println("\n===========================================================");
        


        List <Integer> llist =new LinkedList<>();
        for (int i = 0 ; i <=15; i++){
            llist.add(i);
        }
        System.out.println("Linked List : ");
        for (Integer x : llist) {
            System.out.print(x+" , ");
            if(x%2==0){
                int temp = llist.indexOf(x);
                llist.set(temp, 0);
            }
        }
        System.out.println("\n===========================================================");

// to remove items  where value is 0, but this would give ConcurrentModificationException
        /*boolean flag = false;
        for (Integer x : llist) {
            if (x==0) {
                if (flag) {
                    int index = llist.indexOf(x);
                    llist.remove(index);
                }
                flag =!flag;
            }
        }*/
// thats why we use iterator for that
        boolean flag2 = true;
        Iterator<Integer> itr = llist.listIterator();
        while (itr.hasNext()) {
            int val = itr.next();
            if (val==0) {
                if (flag2) {
                    itr.remove();
                }
            }
        }
        System.out.println("Modified linked listy with iterator : ");
        for (Integer x : llist) {
            System.out.print(x + ", ");
        }
        System.out.println("\n===========================================================");



        ArrayList<fighter> fighters = new ArrayList<>();
        fighters.add(new fighter("John",28));
        fighters.add(new fighter("Khabib",29));
        fighters.add(new fighter("Daniel",22));
        fighters.add(new fighter("Demetrious",27));
        fighters.add(new fighter("Siddharth",30));

        System.out.println(fighters);
        System.out.println("===========================================================");
        Collections.sort(fighters);
        System.out.println(fighters);
        System.out.println("===========================================================");

        









    }
}

class fighter implements Comparable<fighter> {
    private String name;
    private int wins;
    public fighter(String name, int wins){
        this.name =name;
        this.wins = wins;
    }
    public String toString(){
        return name +"->"+wins;
    }
    public int compareTo(fighter obj){
        return obj.wins-this.wins; //if we reverse obj and this then it will sort in asc
    }
  
}