package com.base.design.template;
/**
 * ����ʵ�־��巽��
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
