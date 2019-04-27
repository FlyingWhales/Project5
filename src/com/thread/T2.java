package com.thread;

public class T2 implements Runnable {

	public void process() {

		while (true) {
			System.out.println("Hello from " + this.getClass().getName());
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

	@Override
	public void run() {
		process();
		
	}

}
