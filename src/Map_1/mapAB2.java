package Map_1;

import java.util.Map;

public class mapAB2 {
	public Map<String, String> mapAB2(Map<String, String> map) {
		  if(map.containsKey("a")){
		    if(map.get("a").equals(map.get("b"))){
		  		    map.remove("a");
		  		    map.remove("b");
		  	}
		  }
			return map;
		}
}
