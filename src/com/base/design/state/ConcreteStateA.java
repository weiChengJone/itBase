package com.base.design.state;

public class ConcreteStateA implements State {

	private int i = 0;
	@Override
	public void handleState(Context context) {
			
		if(i < 6){
			System.out.println("StateA:"+i);
			i++;
		}else{
			context.setState(new ConcreteStateB());
		}
			
	}

}
