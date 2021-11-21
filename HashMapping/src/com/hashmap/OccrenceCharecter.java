package com.hashmap;

import java.util.LinkedHashMap;

public class OccrenceCharecter {
	
	public static void main(String[] args) {
		getCountChar("asdasdsdiwerewdbwedwedwertoa!!!   !!");
	}
	
	
	public static void getCountChar(String str) {
		
		LinkedHashMap<Character, Integer> map= new LinkedHashMap<>();
		char[] strarray = str.toCharArray();
		for(char c:strarray) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}
			else {
				map.put(c, 1);
			}
		}
		System.out.println(str+" has "+map);
		
		
	}
}
