import java.util.*;

class HashMapConcurrencyExample {
    public static void main(String[] args) {
        // Create a normal HashMap (Not thread-safe)
        Map<Integer, String> map = new HashMap<>();

        // Adding initial key-value pairs
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");

        // Writer Thread: Modifies the map
        Thread writerThread = new Thread(() -> {
            for (int i = 4; i <= 6; i++) {
                map.put(i, "Fruit" + i);
                System.out.println("Writer Thread added: " + i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Reader Thread: Iterates over the map while it's being modified
        Thread readerThread = new Thread(() -> {
            try {
                for (Map.Entry<Integer, String> entry : map.entrySet()) {
                    System.out.println("Reader Thread read: " + entry.getKey() + " -> " + entry.getValue());
                    Thread.sleep(50);
                }
            } catch (Exception e) {
                System.out.println("Exception Occurred: " + e);
            }
        });

        writerThread.start();
        readerThread.start();

        try {
            writerThread.join();
            readerThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final Map: " + map);
    }
}
