package com.test.basic;

import java.util.stream.IntStream;

public class TestMain {

	public static void main(String[] args) throws ClassNotFoundException,
			InterruptedException {
		/*
		 * Supplier<ThreadBasicTesting> basicTesting=ThreadBasicTesting::new;
		 * Supplier<ThreadBasicTesting> basicTesting2=ThreadBasicTesting::new;
		 */
		ThreadBasicTesting basicTesting = new ThreadBasicTesting();
		Runnable runnable = () -> {

			System.out.println(basicTesting.hashCode());
			basicTesting.testMethod7();

		};

		/*
		 * Runnable runnable2=() ->{
		 * 
		 * System.out.println(basicTesting.hashCode());
		 * basicTesting.testMethod8();
		 * 
		 * };
		 */
		Thread t1 = new Thread(runnable);
		t1.start();
		// new Thread(runnable2).start();

		IntStream.range(10, 14).forEach(s -> {
			System.out.println("main thread" + Thread.currentThread());
		});

	}
}
