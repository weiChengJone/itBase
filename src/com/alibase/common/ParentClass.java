package com.alibase.common;

public class ParentClass {

    public String name = "parent";

    public static void main(String[] args) {
        ParentClass parentClass = new SonClass();
        SonClass sonClass = new SonClass();

        System.out.println("parentClass.name = " + parentClass.name);
        System.out.println("sonClass.name = " + sonClass.name);
        System.out.println("debug...");
    }
}

	class SonClass extends ParentClass {
	    public String name = "son";
		
	}
	
	
	/**
	 * 【强制】避免在子父类的成员变量之间或者不同代码块的局部变量之间采用完全相同的命名方式，那会导致代码可读性降低。
	 * 可以提高代码可读性
			减少新人看代码时不必要的困惑
			减少重构时不必要的困惑
	 */
