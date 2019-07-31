package com.alibase.jvm;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ThreadTest {

	/**
	 * java�߳�ģ�� 1��1      goLang�߳�ģ�Ͷ�Զ�
	 * 
	 * https://blog.csdn.net/maosijunzi/article/details/42527553  --��java�߳̿����������ڶ��cpu������
	 * 
	 * ����һ���߳�ֻ����һ��cpu�д�����Ƭ������߳����������cpu����
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
		 * Ĭ���û��߳�
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