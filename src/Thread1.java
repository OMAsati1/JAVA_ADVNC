public class Thread1 extends Thread {

    Counter counter;

    Thread1(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
//        for(;;) System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 10000; i++) {
            counter.increment();
        }
    }
}
