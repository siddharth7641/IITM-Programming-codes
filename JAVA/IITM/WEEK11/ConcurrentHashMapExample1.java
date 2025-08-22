import java.util.concurrent.ConcurrentHashMap;

class ConcurrentHashMapExample1 {
    public static void main(String[] args) {
        // Create a ConcurrentHashMap
        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();

        // Adding key-value pairs
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");

        // Starting multiple threads to modify the map
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

        Thread readerThread = new Thread(() -> {
            for (int i = 1; i <= 6; i++) {
                System.out.println("Reader Thread read: " + map.getOrDefault(i, "Not Found"));
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
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

