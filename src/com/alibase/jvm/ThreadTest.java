package com.alibase.jvm;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ThreadTest {

	/**
	 * java线程模型 1对1      goLang线程模型多对多
	 * 
	 * https://blog.csdn.net/maosijunzi/article/details/42527553  --》java线程可以在运行在多个cpu核上吗
	 * 
	 * 所以一个线程只能在一个cpu中处理切片，多个线程则分配给多个cpu处理。
	 * @throws InterruptedException 
	 */
	
	public static void main(String[] args) throws InterruptedException {
		
//		testThreadRun();
		testThreadRunDemoe();
		
	}
	
	public static void testThreadRun() throws InterruptedException{
		new Thread(() -> {
			for(;;){
				
				try {
					Thread.sleep(3000);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				System.out.println("hello world");

			}
		},"thred-hello").start();
		
		System.out.println("main thread out");
		
		Thread.currentThread().join();
	}
	
	
	public static void testThreadRunDemoe() throws InterruptedException{
		Thread threadno = new Thread(() -> {
			for(;;){
				
				try {
					Thread.sleep(3000);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				System.out.println("hello world");

			}
		},"thred-hello");
		
		threadno.setDaemon(true);
		threadno.start();
		
		System.out.println("main thread out");
		
		Thread.currentThread().interrupt();
	}
	
	
	public static void testThreadPool() throws InterruptedException{
		/**
		 * 默认用户线程
		 */
		ThreadPoolExecutor threadPoll = (ThreadPoolExecutor) Executors.newFixedThreadPool(1);
		threadPoll.execute(new Runnable(){

			@Override
			public void run() {
				System.out.println("hello");
				
			}
		
		});
		
		threadPoll.shutdown();
	}
}