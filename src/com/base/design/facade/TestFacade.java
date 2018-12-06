package com.base.design.facade;

public class TestFacade {

	/**
	 * �����û� ���� ��Ʊ ���� �ȵ� ����
	 * @param args
	 */
	public static void main(String[] args) {
		
	}
	
	public static void noFacade(){
		People people = new People(); //�û�1
		
		Shares shares = new Shares();//��ȡ��Ʊ��Ϣ
		shares.buy();
		shares.seller();
		Estate estate = new Estate();//��ȡ������Ϣ
		estate.buy();
		estate.seller();
		
		
		People people2 = new People(); //�û�2
		
		Shares shares2 = new Shares();
		
		Estate estate2 = new Estate();
		//...
		People people3 = new People(); //�û�3
		
		Shares shares3 = new Shares();
		
		Estate estate3 = new Estate();
		//...
	}
	
	
	public static void withFacade(){
		People people = new People(); //�û�1   ==>�û����ع�ϵ ��Ʊ���� ��������������������   ������漴�ɡ�
									  //        ==���û������˽���������ô��Ӫ�ģ���ǮȡǮ���ɣ�
		FacadeClass facadeClass = new FacadeClass();
		facadeClass.buy();
		facadeClass.seller();
	}
	
}
