package com.base.bingfa21;

import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


public class TestTaskWithResult implements Callable<String>{

	private int id;
	
	public TestTaskWithResult(int id){
		this.id = id;
	}
	
	@Override
	public String call(){
		
		return ""+id;
	}

	public static void main(String[] args) {
		
		ExecutorService exeu = Executors.newCachedThreadPool();
		ArrayList<Future<String>> results = new ArrayList<Future<String>>();
		for (int i = 0; i < 10000; i++) {
			results.add((exeu.submit(new TestTaskWithResult(i))));
		for (Future<String> future : results) {
			System.out.println(i);
			System.out.println(future.isDone());
			if(future.isDone()){
				try {
					future.get();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ExecutionException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		}
	}
}
