package Map_2;

import java.util.HashMap;
import java.util.Map;

public class pairs {
	public Map<String, String> pairs(String[] strings) {
		Map<String, String> map = new HashMap<>();
		for (String s : strings){
		    map.put(s.substring(0,1), s.substring(s.length()-1,s.length()));  
		}  
		return map;
	}
}
