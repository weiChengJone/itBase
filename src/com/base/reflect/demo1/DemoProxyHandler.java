package com.base.reflect.demo1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * ��̬��������
 * @author Administrator
 *
 */
public class DemoProxyHandler implements InvocationHandler{

	/**
	 * �������
	 */
	private Object beProxy;

	public Object getBeProxy() {
		return beProxy;
	}

	public void setBeProxy(Object beProxy) {
		this.beProxy = beProxy;
	}


	/**
	 * proxy  ����
	 * 
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		System.out.println("���Ǵ�����������");
		return method.invoke(beProxy, args);
	}

}
