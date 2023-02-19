public class adder implements  Runnable {

    int limit = 10000;
    counter adderCount;
    adder(counter counter) {
       this.adderCount = counter;
    }

    @Override
    public void run() {
        for(int i=0;i<this.limit;i++) {
            System.out.println("Adder - Thread " + Thread.currentThread().getName() + " i = " + i);
            this.adderCount.count += i;
        }
    }
}
