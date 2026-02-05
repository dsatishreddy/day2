package day3;
import java.util.HashMap;
import java.util.Map;

public class HashMapLoginExample {

    static Map<String, Integer> loginMap = new HashMap<>();

    public static void main(String[] args) {

        Runnable task = () -> {
            for (int i = 0; i < 1000; i++) {
                String user = "user1";

                Integer count = loginMap.get(user);
                if (count == null) {
                    loginMap.put(user, 1);
                } else {
                    loginMap.put(user, count + 1);
                }
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();
    }
}


/*
 * In a multi-threaded environment, HashMap can cause data inconsistency due to
 * race conditions, whereas ConcurrentHashMap ensures thread safety using
 * fine-grained locking and atomic operations like CAS, making it suitable for
 * concurrent access.
 */