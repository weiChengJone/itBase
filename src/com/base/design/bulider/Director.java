package com.base.design.bulider;

/**
 * ָ�ӹ�  ͳ��
 * �淶�������� Ԥ����Ҫ����ȱʧ
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
