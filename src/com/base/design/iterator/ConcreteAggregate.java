package com.base.design.iterator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteAggregate implements Aggregate{

	private List<String> list = new ArrayList<String>();
	
	@Override
	public Iterator createIterator() {
		return new ConcreteIterator(this);
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}
	
}
