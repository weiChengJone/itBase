package com.base.design.template;
/**
 * 子类实现具体方法
 * @author Administrator
 *
 */
public class MethodBenchark extends Benchark {

	@Override
	public void benchark() {
		
		for (int i = 0; i < 10; i++) {
			System.out.println("i="+i);
		}

	}

}
