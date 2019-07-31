package com.jvm.utilUse;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by CC on 2019/7/18.
 * JConsoleº‡ ”¥˙¬Î
 */
public class OOMUtilObeject {

    static class OMMObject{
        public byte[] placeholder = new byte[64 * 1024];
    }

    public static void fillHeap(int num) throws InterruptedException {
        List<OMMObject> list = new ArrayList<OMMObject>();
        for (int i = 0; i < num; i++){
            Thread.sleep(50L);
            list.add(new OMMObject());
        }

        System.gc();
    }
    public static void main(String[] args) throws InterruptedException {
        fillHeap(1000);
    }
}
