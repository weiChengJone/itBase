package com.base.design.bulider;

/**
 * 指挥官  统筹
 * 规范操作流程 预防必要操作缺失
 * 
 * @author Administrator
 *
 */
public class Director {

	public void Construct(Builder builder){
		builder.builderA();
		builder.builderB();
	}
}
