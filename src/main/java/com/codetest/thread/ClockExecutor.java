package com.codetest.thread;

import com.codetest.ClockApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Class executor for Clock thread
 */
public class ClockExecutor {
    private static Logger logger = LoggerFactory.getLogger(ClockApplication.class);

    public static void run (){
        try
        {
            //Set value for seconds
            ClockThread clockSec = new ClockThread("ClockSec", "TICK", 1000);
            clockSec.start();

            //Set value for minutes
            ClockThread clockMin = new ClockThread("ClockMin", "TOCK", 60000 );
            clockMin.start();

            //Set value for hours
            ClockThread clockHour = new ClockThread("ClockHour", "BONG", 3600000 );
            clockHour.start();

            //Change the value (seconds) every 30 seg.
            //Value changed during runtime to accomplish the requirement (alter printed values)
            Thread.sleep(30000);
            clockSec.setValue("TICK-123");

            //Stops in 3h
            Thread.sleep(1000 * 60 * 60 * 3);
            logger.info("Stopping after 3h");
            System.exit(0);
        } catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }

    }

}
