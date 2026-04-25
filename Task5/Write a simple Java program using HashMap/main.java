package pakage8;

import java.util.HashMap;
import java.util.Set;

public class HashMapTask {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();         
		map.put(1, "heba");
		map.put(2, "basil");
		map.put(3,"hala");
		map.put(4,"khalil");
		// try to duplicate key 
		map.put(3,"rahaf");
        System.out.println("Iterating HashMap ... ");
		Set <Integer> keys = map.keySet();
		for ( Integer key:keys) {
			System.out.println(key + " " + map.get(key));
		}
		}
		

		

	}


