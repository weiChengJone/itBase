package com.base.thinkjava;

/**
 * Created by CC on 2019/7/19.
 */
public class Instrument {

    public void play(){
        System.out.println("play");
        play();
    }

    public static void main(String[] args) {
        Instrument ins = new Instrument();
        ins.play();
    }
}
