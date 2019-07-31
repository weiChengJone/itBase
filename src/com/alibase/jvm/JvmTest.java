package com.alibase.jvm;

/**
 * 堆 线程共享
 * 
 * 栈 线程独立
 * @author Administrator
 *https://mp.weixin.qq.com/s?__biz=MzU2MTA1OTgyMQ==&mid=2247484780&idx=1&sn=b0ce1dd2a9355a012f61482a72e06dac&chksm=fc7fc7eecb084ef8344b3c5035b49058d063cc6da68c7ddd546cb411643900955e3c4d7cc75f&token=2012406850&lang=zh_CN#rd
  内存 synchronized 与 volatile 区别
  volatile -》内存可见性，指令重排序
  synchronized -》原子性，内存可见性
 *计算机硬件内存架构：cpu 					
 *						->寄存器
 *						->L1cache    }-->多核多个
 *					 L2Cache
 *					 主内存    }多个内存条多个
 *
 *
 *
 *jvm内存模型：     栈   }-->多个线程多个
 *               堆
 */
public class JvmTest {

	public static void main(String[] args) {
		
	}
	
	class JvmMemeroy{
		private volatile int count = 1;

		public int getCount() {
			return count;
		}

		public void setCount(int count) {
			this.count = count;
		}
		
		
	}
	
	class JvmScy{
		
		private int count = 1;

		public synchronized int getCount() {
			return count;
		}

		public synchronized void setCount(int count) {
			this.count = count;
		}
		
	}
	
}
