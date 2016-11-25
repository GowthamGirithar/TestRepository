package com.test.basic;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.StampedLock;
import java.util.stream.IntStream;

public class ThreadBasicTesting {
	
	ReentrantLock reentrantLock =new ReentrantLock();
	ReentrantReadWriteLock lock=new ReentrantReadWriteLock();
	StampedLock stampedLock=new StampedLock();
	public void testMethod1(ThreadBasicTesting basicTesting){
		synchronized (basicTesting) {
			IntStream.range(0, 10).forEach(s-> {
				Thread.currentThread();
				try {
					Thread.sleep(500);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("testMethod1");});
			
		}
		
	}
	public void testMethod1Part2(ThreadBasicTesting basicTesting){
		synchronized (basicTesting) {
			
			IntStream.range(0, 10).forEach(s-> {
				Thread.currentThread();
				try {
					Thread.sleep(500);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("testMethod1Part2");});	
		}
		
	}
	
	public void testMethod2(Object object){
		synchronized (ThreadBasicTesting.class) {
			Thread.currentThread();
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			IntStream.range(0, 10).forEach(s-> {System.out.println("testMethod2");});
		}
		
	}
	
	public synchronized void testMethod3(){
		
		IntStream.range(0, 10).forEach(s-> {Thread.currentThread();
		try {
			Thread.sleep(450);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}System.out.println("testMethod3");});
	}
	
    public synchronized void testMethod4(){
    	
    	IntStream.range(0, 10).forEach(s-> {Thread.currentThread();
		try {
			Thread.sleep(450);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}System.out.println("testMethod4");});
	}
    
    public static synchronized void testMethod5(){
    	
    	IntStream.range(0, 10).forEach(s-> {Thread.currentThread();
		try {
			Thread.sleep(450);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}System.out.println("testMethod5");});
	}
    public static synchronized void testMethod6(){
    	Thread.currentThread();
		try {
			Thread.sleep(500);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	IntStream.range(0, 10).forEach(s-> {System.out.println("testMethod6");});
	}
    public void testMethod7(){
    	lock.readLock().lock();
    	IntStream.range(0, 10).forEach(s-> {System.out.println(Thread.currentThread());});
		
    	lock.readLock().unlock();
    }
    public void testMethod8(){
    	lock.readLock().lock();
    	IntStream.range(0, 10).forEach(s-> {Thread.currentThread();
		try {
			Thread.sleep(450);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}System.out.println("testMethod8");});
    	lock.readLock().unlock();
    }

}
