import java.util.Queue;

public class Consumer extends Thread {

    private final Queue sharedq;

    public Consumer(Queue sharedq) {

        this.sharedq = sharedq;
    }

    public void run() {

        for (int i = 0; i < 4; i++) {
            synchronized (sharedq) {
                while (sharedq.size() == 0)

                    try {
                        sharedq.wait();
                    } catch (Exception e) {
                        // TODO: handle exception
                    }



            System.out.println("Consuming  :"+sharedq.poll());
            sharedq.notifyAll();
            }
        }
    }
}
