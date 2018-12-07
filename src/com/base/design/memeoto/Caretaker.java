package com.base.design.memeoto;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {

	private List<Memento> mementoList = new ArrayList<Memento>();

	public Caretaker(Memento memento){
		mementoList.add(memento);
	}
	
	public List<Memento> getMementoList() {
		return mementoList;
	}

	public void setMementoList(List<Memento> mementoList) {
		this.mementoList = mementoList;
	}
	
	
}
