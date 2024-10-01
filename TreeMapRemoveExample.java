package com.lmsDay9;

import java.util.TreeMap;

public class TreeMapRemoveExample {

	public static void main(String[] args) {
		//create Treemap
		
		TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("One", 1);
        treeMap.put("Two", 2);
        treeMap.put("Three", 3);

      
        System.out.println("TreeMap: " + treeMap);
        
     //   treemap.remove("Two");
        System.out.println(treeMap.remove("Two"));
        
        //remove three 3 
        System.out.println(treeMap.remove("Three", 3));
        
        //updated treemap
        System.out.println("updated treemap: "+treeMap);

	}

}
