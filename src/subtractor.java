public class subtractor implements Runnable{

    int limit = 10000;
    counter subtractorCounter;

    subtractor(counter counter) {
        this.subtractorCounter = counter;
    }

    @Override
    public void run() {
        for(int i=0;i<this.limit;i++) {
            System.out.println("Subtractor - Thread " + Thread.currentThread().getName() + " i = " + i);
            this.subtractorCounter.count -= i;
        }
    }
}
