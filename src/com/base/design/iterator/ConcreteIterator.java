package com.base.design.iterator;

public class ConcreteIterator implements Iterator {

	private ConcreteAggregate concreteAggregate;
	
	private int current = 0;
	
	public ConcreteIterator(ConcreteAggregate concreteAggregate2) {
		this.concreteAggregate = concreteAggregate2;
	}

	@Override
	public Object first() {
		return concreteAggregate.getList().get(0);
	}

	@Override
	public Object next() {
		Object obj = null;
		current++;
		if(current < concreteAggregate.getList().size()){
			obj = concreteAggregate.getList().get(current);
		}
		return obj;
	}

	@Override
	public Object isDone() {
		
		return current >= concreteAggregate.getList().size()?true:false;
	}

	@Override
	public Object currentItem() {
		return concreteAggregate.getList().get(current);
	}

}
