//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    void main() {

        /*Thread1 thread1 = new Thread1();
        thread1.start();

        Thread2 thread2 = new Thread2();
        Thread thread = new Thread(thread2);
        thread.start();

        for(;;) System.out.println(Thread.currentThread().getName());*/
        Counter counter = new Counter();

        Thread1 t1 = new Thread1(counter);
        Thread1 t2 = new Thread1(counter);
        t1.start();
        t2.start();
      try  {
            t1.join();
            t2.join();
        }
      catch (Exception e) {
          System.out.println(e.getMessage());
      }

        System.out.println(counter.getCounter());
    }
}