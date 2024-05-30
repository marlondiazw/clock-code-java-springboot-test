package com.codetest.thread;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Thread to control the clock attributes
 */
public class ClockThread extends Thread {
    Logger logger = LoggerFactory.getLogger(ClockThread.class);
    private String value;
    private int mill;

    public ClockThread(String name, String value, int mill){
        super(name);
        this.value = value;
        this.mill = mill;
    }

    public synchronized void setValue(String value) {
        this.value = value;
        logger.info( getName() + " value changed to: "+ this.value);
    }

    public synchronized String getValue(){
        return this.value;
    }

    @Override
    public void run() {
        try {
            while (true) {
                Thread.sleep(mill);
                logger.info(value);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
