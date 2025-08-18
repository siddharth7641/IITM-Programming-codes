public class iterator {
    public static void main(String[] args) {
        items i = new items();
        Inneriterator ii=i.getitemiterator();

        while (ii.has_next()) {
            System.out.println(ii.get_next());
        }

        // backiterator bi = (backiterator)ii;
        // while (bi.has_prev()) {
        //     System.out.println(bi.get_prev());
        // }
        while (((backiterator)ii).has_prev()) {
            System.out.println(((backiterator)ii).get_prev());
        }

    }    
}

interface Inneriterator {
    Boolean has_next();
    Object get_next();
    
} 

interface backiterator{
    Boolean has_prev();
    Object get_prev();
}

class items{
    private int [] arr ={10,20,30,11,89};
    public itemiterator getitemiterator(){
        return new itemiterator();
    }

    private class itemiterator implements Inneriterator, backiterator{
        public itemiterator(){
            i=-1;
        }
        private int i ;
        public Boolean has_next(){
            if (i == arr.length-1)
                return false;
            return true;
        }
        public Object get_next(){
            i++;
            return arr[i];
        }
        public Boolean has_prev(){
            if (i == 0)
                return false;
            return true;
        }
        public Object get_prev(){
            i--;
            return arr[i];
        }
    }
}