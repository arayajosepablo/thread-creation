package com.jpa.threads;

import com.jpa.objects.Safe;

public class DescendingThiefThread extends ThiefThread {

    public DescendingThiefThread(Safe safe) {
        super(safe);
    }

    @Override
    public void run() {
        for (int i=Safe.MAX_PIN; i>=0; i--) {
            if(safe.isCorrect(i)) {
                System.out.println(this.getName() + " found the password " + i);
                System.exit(0);
            }
        }
    }
}
