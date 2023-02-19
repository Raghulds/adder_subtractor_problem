public class Main {
    public static void main(String[] args) throws InterruptedException {

        counter mainCounter = new counter();
        adder adderInstance = new adder(mainCounter);
        subtractor subtractorInstance = new subtractor(mainCounter);

        Thread t1 = new Thread(adderInstance);
        Thread t2 = new Thread(subtractorInstance);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Counter value is " + mainCounter.count);
    }
}