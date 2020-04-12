package com.jpa.threads;

import com.jpa.objects.Safe;

public abstract class ThiefThread extends Thread {

    protected Safe safe;

    public ThiefThread(final Safe safe) {
        this.safe = safe;
        this.setPriority(Thread.MAX_PRIORITY);
        this.setName(this.getClass().getSimpleName());
    }

    @Override
    public synchronized void start() {
        System.out.println("Starting thread " + this.getName());
        super.start();
    }
}
