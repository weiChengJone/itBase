package com.base.design.state;

public class ConcreteStateB implements State {

	private int i = 0;
	@Override
	public void handleState(Context context) {
			
		if(i < 2){
			System.out.println("StateB:"+i);
			i++;
		}else{
			context.setState(new ConcreteStateA());
		}		

	}

}
