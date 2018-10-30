package com.base.chapter;

public class Bird {
	private String id;
	private String category;
	private String noise;
	
	
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

	private void showNoise(Bird bird){
		System.out.println(bird.getNoise());
	}
	
	private void showCategoty(Bird bird){
		System.out.println(bird.getCategory());
	}
	
	public static void main(String[] args) {
		
		Bird bird = new Bird();
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
	}
	
}
