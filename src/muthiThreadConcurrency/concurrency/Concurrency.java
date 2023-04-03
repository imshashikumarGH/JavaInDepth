package muthiThreadConcurrency.concurrency;

class Sample {
    private int x = 10;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    //issue no locking
    public void issueInc() throws InterruptedException {
        int z = getX();

        Thread.sleep(1000);
        z++;
        setX(z);
        System.out.println(" issueInc() --- value of x after " + Thread.currentThread().getName() + " is - " + getX());
    }

    //this will allow the thread lock the method until the thread releases it
    public synchronized void solutionInc() throws InterruptedException {
        int z = getX();

        Thread.sleep(1000);
        z++;
        setX(z);
        System.out.println(" solutionInc() --- value of x after " + Thread.currentThread().getName() + " is - " + getX());
    }
}

class MyThread extends Thread {
    Sample sample;

    MyThread(Sample obj) {
        this.sample = obj;
    }

    @Override
    public void run() {
        try {
            sample.issueInc();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        try {
            sample.solutionInc();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}


public class Concurrency {
    public static void main(String[] args) throws InterruptedException {
        Sample s1 = new Sample();

        MyThread thread1 = new MyThread(s1);
        MyThread thread2 = new MyThread(s1);

        thread1.start();
        ;
        thread2.start();

        System.out.println(" waiting for the thread to complete");
        thread1.join();
        thread2.join();

        System.out.println(s1.getX());

    }

}


