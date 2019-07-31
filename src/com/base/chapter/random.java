package com.base.chapter;

import java.util.Random;

/**
 * Created by CC on 2019/7/29.
 */
public class random {

    public static void main(String[] args) {
//        Random random = new Random(1);
//        for (int i = 0;i<10;i++){
//            int userId = random.nextInt(10000);
//            System.out.println(userId);
//        }
        for (int i = 0;i<10;i++) {
            int userId = (int) (1 + Math.random() * (10000 - 1 + 1));
            System.out.println(userId);
        }
    }
}
