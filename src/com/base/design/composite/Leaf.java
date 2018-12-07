package com.base.design.composite;

import java.util.Collections;

public class Leaf implements Component {

	@Override
	public void addComposite(Component c) {
		
		System.out.print("不是子容器");
	}

	@Override
	public void removeComposite(Component c) {
		System.out.print("不是子容器");

	}

	@Override
	public Component getComposite(int i) {
		System.out.print("不是子容器");
		return null;
	}

	@Override
	public void operation(int i) {
		String s = String.join("", Collections.nCopies(i, "-"));
		System.out.println(s+"业务方法");

	}

}
