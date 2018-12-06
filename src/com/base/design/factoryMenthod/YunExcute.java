package com.base.design.factoryMenthod;

public interface YunExcute {
	
	void putParam(YunParam yunParam);
	
	YunParam getParam();
	
	String doSomeThing(YunParam yunParam);
}
