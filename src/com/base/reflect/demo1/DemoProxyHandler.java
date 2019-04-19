package com.base.reflect.demo1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态对象处理器
 * @author Administrator
 *
 */
public class DemoProxyHandler implements InvocationHandler{

	/**
	 * 代理对象
	 */
	private Object beProxy;

	public Object getBeProxy() {
		return beProxy;
	}

	public void setBeProxy(Object beProxy) {
		this.beProxy = beProxy;
	}


	/**
	 * proxy  自身
	 * 
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		System.out.println("这是代理做的事情");
		return method.invoke(beProxy, args);
	}

}
