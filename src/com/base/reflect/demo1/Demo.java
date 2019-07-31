package com.base.reflect.demo1;

import java.lang.reflect.Proxy;

/**
 * 反射实现动态代理  https://www.cnblogs.com/luoxn28/p/5686794.html
 * @author Administrator
 *
 */
public class Demo {

	/**
	 * service一般会注入
	 */
	
	public static void main(String[] args) {
		
		DemoServiceImpl demoServiceImpl = new DemoServiceImpl();

		
		ClassLoader loader = DemoService.class.getClassLoader();
		
		
		Class<?>[] interfaces = {DemoService.class};
		DemoProxyHandler h = new DemoProxyHandler();
//		h.setBeProxy(demoServiceImpl);
		DemoService demoService = (DemoService)Proxy.newProxyInstance(loader , interfaces , h);
		demoService.doDemoThing();
	}
}
