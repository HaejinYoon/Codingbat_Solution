package Map_1;

import java.util.Map;

public class mapAB3 {
	public Map<String, String> mapAB3(Map<String, String> map) {
		  if(map.get("a")==null&&map.get("b")!=null){
		    map.put("a",map.get("b"));
		  } else if(map.get("a")!=null&&map.get("b")==null){
		    map.put("b",map.get("a"));
		  } else if(map.get("a")!=null&&map.get("b")!=null){
		    return map;
		  }
		  return map;
		}

}
