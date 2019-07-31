package com.base.common.mapUtil;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		
//		mapLoopByEach();
		
//		mapLoopByIteaor();
		
		mapLoopByIteaorByCondition();
	}
	
	public static void mapLoopByEach(){
		Map<Integer, Integer> map1 = new HashMap<>();
		Map<Integer, Integer> map2 = new HashMap<>();
		map1.put(1, 1);
		map1.put(2, 2);
		map2.put(1, 1);
		map2.put(2, 2);
		
		//Exception in thread "main" java.util.ConcurrentModificationException
		for(int key1 : map1.keySet()){
			for(int key2 : map2.keySet()){
				if(key1 == key2)
					map1.remove(key1);
			}
		}
	}
	
	/**
	 * modCount×Ô¼ºÎ¬»¤
	 */
	public static void mapLoopByIteaor(){
		Map map1 = new HashMap<Integer, Integer>();
		Map map2 = new HashMap<Integer, Integer>();
		map1.put(1, 1);
		map1.put(2, 2);
		map2.put(1, 1);
		map2.put(2, 2);
		
		Iterator<Integer> iterator1 = map1.keySet().iterator();
		while(iterator1.hasNext()){
			int key1 = iterator1.next();
			Iterator<Integer> iterator2 = map2.keySet().iterator();
			while(iterator2.hasNext()){
				int key2 = iterator2.next();
				if(key1 == key2)
					iterator1.remove(); //map1.remove(key1);
			}
		}
		
		System.out.println(map1);
	}
	
	
	public static void mapLoopByIteaorByCondition(){
		Map map1 = new HashMap<Integer, Integer>();
		Map map2 = new HashMap<Integer, Integer>();
		map1.put(1, 1);
		map1.put(2, 2);
		map2.put(1, 1);
		map2.put(2, 2);
		map2.put(3, 3);

		Iterator<Integer> iterator1 = map1.keySet().iterator();
		while(iterator1.hasNext()){
			int key1 = iterator1.next();
			Iterator<Integer> iterator2 = map2.keySet().iterator();
			while(iterator2.hasNext()){
				int key2 = iterator2.next();
				if(key1 == key2)
					iterator1.remove(); //map1.remove(key1);
			}
		}
		
		System.out.println(map1);
	}
}
