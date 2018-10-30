package com.base.chapter;

import java.util.ArrayList;

public class YinWu extends Bird {

	private String noise;
	
	public String getNoise() {
		return noise;
	}

	public void setNoise(String noise) {
		this.noise = noise;
	}

	public YinWu(){
		super();
		this.noise="ðÐðÄ·Æ·Æ";
		this.setNoise("ðÐðÄ·É");
	}
	
	public static void main(String[] args) {
		Bird bird = new YinWu();
		bird.setId("1");
		Bird bird1 = new Bird();
		bird1.setId("11".substring(0, 1));
		
		System.out.println(bird.getId() == bird1.getId());

		/*YinWu yinwu = new YinWu();
		System.out.println(bird.getNoise());
		System.out.println(yinwu.getNoise());
		System.out.println(bird.toString());
		System.out.println(yinwu.toString());
		
		yinwu.setNoise("ðÐðÄ·É");
		System.out.println(yinwu.toString());
		
		ArrayList<Bird> list = new ArrayList<Bird>();
		list.add(yinwu);
		list.add(bird);
		list.add(bird1);
		for (Bird bird2 : list) {
			System.out.println("--"+bird2.toString());
		}
		System.out.println(yinwu.getId() == bird.getId());
		System.out.println(yinwu.getCategory() == bird.getCategory());
		System.out.println(yinwu.getNoise() == bird.getNoise());*/

	}
	
	
}
