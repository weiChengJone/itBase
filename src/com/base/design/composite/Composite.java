package com.base.design.composite;

import java.util.ArrayList;
import java.util.Collections;

public class Composite implements Component {

	//������һ���洢�ļ���
    private ArrayList<Component> list = new ArrayList<Component>();
    
	@Override
	public void addComposite(Component c) {
		list.add(c);
	}

	@Override
	public void removeComposite(Component c) {
		list.remove(c);
	}

	@Override
	public Component getComposite(int i) {
		Component c1 =list.get(i);
        return c1;
	}

	@Override
	public void operation(int i) {
		String s = String.join("", Collections.nCopies(i, "-"));
		System.out.println(s+"����");
		 for(Object obj:list){
	            ((Component)obj).operation(i+2);
	        }
	}

}
