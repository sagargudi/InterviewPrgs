package com.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapToArrayList {
 
	public static void main(String[] args) {
		HashMap<Integer, String> map= new HashMap<>();
		map.put(1, "Harish");
		map.put(2, "Krish");
		map.put(3, "Gudi");
		
		
		
		Iterator<Entry<Integer, String>> itr = map.entrySet().iterator();
		while(itr.hasNext()) {
			Map.Entry pairs=(Map.Entry)itr.next();
			System.out.println(pairs.getKey()+" "+pairs.getValue());
		}
		
		List<Integer> key= new ArrayList<>(map.keySet());
		key.forEach(e->System.out.println(e));
		
		
		List<String> value= new ArrayList<>(map.values());
		value.forEach(v->System.out.println(v));
	}
	
}
