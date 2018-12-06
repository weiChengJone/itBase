package com.base.design.template;

/**
 * 模板模式：
 * @author Administrator
 *
 */
public abstract class Benchark {

	/**
	 * 延迟到子类实现
	 */
	public abstract void benchark();
	
	public final long repeat(int count){
		if(count <= 0){
			return 0;
		}else{
			long startTime = System.currentTimeMillis();
			for (int i = 0; i < count; i++) {
				benchark();
			}
			
			long endTime = System.currentTimeMillis();
			
			return endTime - startTime;
		}
	}
	
}
