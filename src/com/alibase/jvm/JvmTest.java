package com.alibase.jvm;

/**
 * �� �̹߳���
 * 
 * ջ �̶߳���
 * @author Administrator
 *https://mp.weixin.qq.com/s?__biz=MzU2MTA1OTgyMQ==&mid=2247484780&idx=1&sn=b0ce1dd2a9355a012f61482a72e06dac&chksm=fc7fc7eecb084ef8344b3c5035b49058d063cc6da68c7ddd546cb411643900955e3c4d7cc75f&token=2012406850&lang=zh_CN#rd
  �ڴ� synchronized �� volatile ����
  volatile -���ڴ�ɼ��ԣ�ָ��������
  synchronized -��ԭ���ԣ��ڴ�ɼ���
 *�����Ӳ���ڴ�ܹ���cpu 					
 *						->�Ĵ���
 *						->L1cache    }-->��˶��
 *					 L2Cache
 *					 ���ڴ�    }����ڴ������
 *
 *
 *
 *jvm�ڴ�ģ�ͣ�     ջ   }-->����̶߳��
 *               ��
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
