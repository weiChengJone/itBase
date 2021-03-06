package com.base.chapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Bird implements Cloneable,Comparable{
	private String id;
	private String category;
	private String noise;

	public static final HashMap<String,String> map = new HashMap<String,String>();
	static{
		map.put("1","1");
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getNoise() {
		return noise;
	}
	public void setNoise(String noise) {
		this.noise = noise;
	}
	
	public Bird() {
		super();
		this.id = "1";
		this.category = "鸟";
		this.noise = "小燕子等等我";
	}
	public Bird(String id, String category, String noise) {
		super();
		this.id = id;
		this.category = category;
		this.noise = noise;
	}

	public void showNoise(Bird bird){
		System.out.println(bird.getNoise());
	}
	
	public void showCategoty(Bird bird){
		System.out.println(bird.getCategory());
	}
	
	public static void main(String[] args) {
		Bird bird = new Bird();
		try {
			bird.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		System.out.println(bird.getId());
		System.out.println(bird.id);
		
		bird.showCategoty(bird);
		bird.showNoise(bird);
	}
	
	@Override
	public String toString() {
		return "Bird [id=" + id + ", category=" + category + ", noise=" + this.getNoise()
				+ "]";
	}
	
	
	public void doSomeThing(Bird bird){
		System.out.println(bird.toString());
		String s = "111";
		String s2 = "111";

		String s3 = new String("111");
		System.out.println(s == s2);
		System.out.println(s.substring(0,1) == s2.substring(0,1));

		System.out.println(s == s3);

		String s4 = "111111".substring(0,3);
		System.out.println("s4:"+s4);
		System.out.println(s == s4);
		System.out.println(s == s4.intern());

		System.out.println(map.get("1"));


	}

	@Override
	public int compareTo(Object o) {
		if (o == null )
		return 0;

		Bird oBird = (Bird)o;
		if(Integer.valueOf(this.getId()) > Integer.valueOf(oBird.getId())){
			return 1;
		}
		return 0;
	}
}
