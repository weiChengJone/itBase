package com.base.design.template;

public class TestTemplate {

	public static void main(String[] args) {
		Benchark ben = new MethodBenchark();
		long time = ben.repeat(10);
		System.out.println("²Ù×÷Ö´ĞĞÁË"+time+"ºÁÃë");
	}
}
