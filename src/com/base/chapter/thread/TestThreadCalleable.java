package com.base.chapter.thread;

import com.base.chapter.Bird;

import java.util.concurrent.*;

/**
 * Created by CC on 2019/7/25.
 * https://www.cnblogs.com/Jansens520/p/8624708.html
 * https://blog.csdn.net/qq_42606051/article/details/81535538   callable，FutureTask的介绍
 */
public class TestThreadCalleable {

    public static void main(String[] args) {
        //testCallable();
        testFutureTask();
    }

    /**
     * 运行结果 true
     *          this is a little bird
     *          result:this is a little bird
     *          可以看出来get()方法是阻塞的
     */
    static void testCallable(){

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Bird> result_bird = executorService.submit(new Callable<Bird>() {

            @Override
            public Bird call() throws Exception {
                System.out.println("this is a little bird");
                Thread.sleep(3000);
                Bird bird = new Bird();
                bird.setId("1");
                bird.setNoise("this is a little bird");
                return bird;
            }
        });

        while (true){
            try {//get
                System.out.println("进true");
                System.out.println("result:" + result_bird.get().getNoise());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }

        }
    }

    static void testFutureTask(){
        //ExecutorService executor = Executors.newCachedThreadPool();
        FutureTask<Integer> futureTask = new FutureTask<>(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                System.out.println("The sub thread is executing the task...");
                Thread.sleep(3000);
                int sum = 0;
                for (int i = 0; i < 100; i++)
                    sum += i;
                return sum;
            }
        });
        Thread thread = new Thread(futureTask);
        thread.start();

        }
}
