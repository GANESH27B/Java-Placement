public class Multithreading {
    public static void main(String[] args) throws InterruptedException {
        Thread worker = new Thread(() -> {
            for (int count = 1; count <= 3; count++) {
                System.out.println("Worker step: " + count);
            }
        });

        worker.start();
        worker.join();
        System.out.println("Main thread finished");
    }
}