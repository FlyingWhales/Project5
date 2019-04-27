package com.thread;

public class ThreadTest {
	public static void main(String[] args) {

		T1 object1 = new T1();
		T2 object2 = new T2();
		
		
		//object1.process();
		//object2.process();
		
		
		
		Thread thread1 = new Thread(object1);
		Thread thread2 = new Thread(object2);
		
		thread1.start();
		thread2.start();
		
	}
}
