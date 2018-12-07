package com.base.design.composite;

import java.util.Collections;

public class Leaf implements Component {

	@Override
	public void addComposite(Component c) {
		
		System.out.print("����������");
	}

	@Override
	public void removeComposite(Component c) {
		System.out.print("����������");

	}

	@Override
	public Component getComposite(int i) {
		System.out.print("����������");
		return null;
	}

	@Override
	public void operation(int i) {
		String s = String.join("", Collections.nCopies(i, "-"));
		System.out.println(s+"ҵ�񷽷�");

	}

}
