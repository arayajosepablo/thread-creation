package com.jpa.threads;

import com.jpa.objects.Safe;

public class AscendingThiefThread extends ThiefThread {

    public AscendingThiefThread(final Safe safe) {
        super(safe);
    }

    @Override
    public void run() {
        for (int i=0; i<=Safe.MAX_PIN; i++) {
            if(safe.isCorrect(i)) {
                System.out.println(this.getName() + " found the password " + i);
                System.exit(0);
            }
        }
    }
}
