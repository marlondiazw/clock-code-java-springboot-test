package com.codetest;

import com.codetest.thread.ClockThread;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClockApplicationTests {

	private ClockThread clockThread;

	@BeforeEach
	void setup() {
		clockThread = new ClockThread("ClockSecTest", "TICK1", 1000);
	}

	@Test
	public synchronized void testModifyThreadValue() throws InterruptedException {
		clockThread.start();
		assertEquals(clockThread.getValue(),"TICK1");
		clockThread.setValue("TICK2");
		assertEquals(clockThread.getValue(), "TICK2");
		Thread.sleep(3000);

		clockThread = new ClockThread("ClockMinTest", "TOCK1", 1000);
		clockThread.start();
		clockThread.setValue("TOCK2");
		assertEquals(clockThread.getValue(), "TOCK2");
		Thread.sleep(3000);

		clockThread = new ClockThread("ClockHourTest", "BONG1", 1000);
		clockThread.start();
		clockThread.setValue("BONG2");
		assertEquals(clockThread.getValue(), "BONG2");
		Thread.sleep(3000);

	}
}
