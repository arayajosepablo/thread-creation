import com.jpa.objects.Safe;
import com.jpa.threads.AscendingThiefThread;
import com.jpa.threads.DescendingThiefThread;
import com.jpa.threads.PoliceThread;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ThreadCreation {

    public static final int MAX_PIN = 9999;

    public static void main(String[] args) {
        final Random random = new Random();
        final Safe safe = new Safe(random.nextInt(MAX_PIN));

        final List<Thread> threads = new ArrayList<>();

        threads.add(new AscendingThiefThread(safe));
        threads.add(new DescendingThiefThread(safe));
        threads.add(new PoliceThread());

        for(Thread thread : threads) {
            thread.start();
        }
    }
}