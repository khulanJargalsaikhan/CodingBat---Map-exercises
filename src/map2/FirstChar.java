package map2;

import java.util.HashMap;
import java.util.Map;

public class FirstChar {

	public static void main(String[] args) {
		System.out.println(firstChar(new String[] {"salt", "tea", "soda", "toast"}));
		System.out.println(firstChar(new String[] {"aa", "bb", "cc", "aAA", "cCC", "d"}));
		System.out.println(firstChar(new String[] {}));

	}

	
	/*
	 * 
Given an array of non-empty strings, return a Map<String, String> with a key for every different first character seen, 
with the value of all the strings starting with that character appended together in the order they appear in the array.


firstChar(["salt", "tea", "soda", "toast"]) 		-> {"s": "saltsoda", "t": "teatoast"}
firstChar(["aa", "bb", "cc", "aAA", "cCC", "d"])	-> {"a": "aaaAA", "b": "bb", "c": "cccCC", "d": "d"}
firstChar([]) 										->{}
	 */
	
	
	public static Map<String, String> firstChar(String[] strings) {

		Map<String, String> map = new HashMap<>();


		for (int i=0; i<strings.length; i++){

			String key = strings[i].substring(0,1);
			String value = strings[i];
			String result = "";

			if (!map.containsKey(key))
				map.put(key, value);
			else {
				result = map.get(key);
				result = result + strings[i];
				map.put(key, result);
			}


		}

		return map;
	}


}
