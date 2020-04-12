package com.jpa.threads;

public class PoliceThread extends Thread {

    @Override
    public void run() {
        this.chaseThieves();
    }

    private void chaseThieves() {
        for (int i = 10; i > 0; i--) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            System.out.println(i);
        }

        System.out.println("Robbery thwarted! Game over.");
        System.exit(0);
    }

    @Override
    public synchronized void start() {
        this.setName(this.getClass().getSimpleName());
        System.out.println("Starting thread " + this.getName());
        super.start();
    }
}
