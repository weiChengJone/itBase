package com.base.design.memeoto;

public class Originator {

	private String state;
	private String meme;
	
	public Originator(){
		this.state = "100";
		this.meme = "����Ҫ����,�����û��";
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getMeme() {
		return meme;
	}

	public void setMeme(String meme) {
		this.meme = meme;
	}
	
	public Memento createMemento(){
		return new Memento(this.state);
	}
	
	public void recoveryMemento(Memento memento){
		this.state = memento.getState();
	}


	
}
