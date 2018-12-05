package com.base.suanfa;

public class DemoInsertSuanFa {

	/**
	 * 为数组3,8,4,5,6,1,9,7 进行排序
	 * @param args
	 */
	public static void main(String[] args) {
		demo1();
	}
	
	public static void demo1(){
		
		int[] s = {3,8,4,5,6,1,9,7};
		
		int length = s.length;
		int temp;
		int j;
		for (int i = 1; i < length ; i++) {		
				
			temp = s[i];
			j=i-1;
			for(;j>=0&&s[j]>temp;j--){
				s[j+1] = s[j];
			}
			s[j+1] = temp;
		}
		
		for (int i : s) {
			System.out.println(i);
		}
		
	}
}
