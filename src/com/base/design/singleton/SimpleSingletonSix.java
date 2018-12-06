package com.base.design.singleton;

/**
 * 饿汉�?
 * 
 * 初试化静态的instance创建�?次�?�如果我们在Singleton类里面写�?个静态的方法不需要创建实例，它仍然会早早的创建一次实例�?��?�降低内存的使用率�??
 * 
 * 没有lazy loading的效果，从�?�降低内存的使用率�??
 * @author Administrator
 *
 */
public class SimpleSingletonSix {

	private SimpleSingletonSix(){
		
	};
	
	private static class SimpleHolder{
		private static final SimpleSingletonSix simpleSingletonSix = new SimpleSingletonSix();
	}
	
	
	/*public static String getNoSimpleSingleton(){
		return NO_SIM;
	}*/
}
