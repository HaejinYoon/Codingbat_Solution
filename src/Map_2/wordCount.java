package Map_2;

import java.util.HashMap;
import java.util.Map;

public class wordCount {
	public Map<String, Integer> wordCount(String[] strings) {
		Map<String, Integer> map = new HashMap<>();

		for(String s: strings){
		    int count = 1;
		    if(map.containsKey(s)){
		      count=map.get(s);
		      count++;
		      map.put(s,count);
		    }
		    map.put(s,count);
		}
		return map;
	}
}
