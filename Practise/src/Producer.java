import java.util.Queue;

public class Producer extends Thread {

    private final Queue sharedq;

    public Producer(Queue sharedq) {

        this.sharedq = sharedq;
    }

    public void run() {
        for (int i = 0; i < 4; i++) {
            synchronized (sharedq) {
                while (sharedq.size() > 0)
                    try {
                        sharedq.wait();
                    } catch (Exception e) {
                        // TODO: handle exception
                    }


            System.out.println("Producing "+sharedq.add(i));
            sharedq.notify();
            }
        }
    }

}
