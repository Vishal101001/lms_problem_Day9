package com.lmsDay9;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapNavigation {

	public static void main(String[] args) {
		TreeMap<Integer,String> treemap = new TreeMap();
		treemap.put(1, "a");
		treemap.put(2, "b");
		treemap.put(3, "c");
		treemap.put(4, "d");
		treemap.put(5, "e");
		
		System.out.println(treemap);
		
		//iterate over keys  
		for(Integer key : treemap.keySet()) {
			System.out.println("key: " + key);
		}
		
		//iterate over values
		for(String value : treemap.values()) {
			System.out.println("value: "+ value);
		}
		
		//iterate over both key and values--> using map.entry method
		
		for(Map.Entry<Integer, String> entry : treemap.entrySet()) {
			System.out.println(entry.getKey() +" -> "+ entry.getValue());
			
			
		}
		System.out.println("-----------------Break--------------");
		
		
		//using Iterator method print key and values
		
		Iterator<Map.Entry<Integer,String>> itr = treemap.entrySet().iterator();
		
		while(itr.hasNext()) {
			Map.Entry<Integer, String> entry = itr.next();
			System.out.println(entry.getKey()+" -> "+ entry.getValue());
		}
		

	}

}
