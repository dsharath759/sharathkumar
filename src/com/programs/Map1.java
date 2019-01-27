package com.programs;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

class Map1
{

	public static void main(String[] args) {
		HashMap<Integer,String> map= new LinkedHashMap<Integer,String>();
		map.put(1, "sharath");
		map.put(2, "sanju ");
		map.put(3, "santosh");
		map.put(4, "df");
		System.out.println(map.get(4));
		//creating another hash map(sorting values by key)
		SortedMap<Integer,String> map2= new TreeMap<Integer,String>();
		map2.put(5, "dfs");
		map2.put(6, "Anjaneyulu");
		map2.put(7, "sathish");
		map2.putAll(map);
		//removing key and value
		map2.remove(5);

		// replace value
		map2.replace(7, "sathishkumar");

		System.out.println(map2.get(3));
		System.out.println(map2.get(6));//key value
		//displaying key and values using for each
		Set<Entry<Integer, String>> entrySet = map2.entrySet();
		for (Entry<Integer, String> entry : entrySet) 
		{
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}


	}
}