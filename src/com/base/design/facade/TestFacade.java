package com.base.design.facade;

public class TestFacade {

	/**
	 * 三个用户 买卖 股票 房产 等等 获利
	 * @param args
	 */
	public static void main(String[] args) {
		
	}
	
	public static void noFacade(){
		People people = new People(); //用户1
		
		Shares shares = new Shares();//获取股票信息
		shares.buy();
		shares.seller();
		Estate estate = new Estate();//获取房产信息
		estate.buy();
		estate.seller();
		
		
		People people2 = new People(); //用户2
		
		Shares shares2 = new Shares();
		
		Estate estate2 = new Estate();
		//...
		People people3 = new People(); //用户3
		
		Shares shares3 = new Shares();
		
		Estate estate3 = new Estate();
		//...
	}
	
	
	public static void withFacade(){
		People people = new People(); //用户1   ==>用户不必关系 股票操作 房产操作获利具体流程   获得利益即可。
									  //        ==》用户不必了解银行是怎么运营的，存钱取钱即可？
		FacadeClass facadeClass = new FacadeClass();
		facadeClass.buy();
		facadeClass.seller();
	}
	
}
