package String_1;

public class atFirst {
	public String atFirst(String str) {
		  if(str.length()<2){
		      if(str.length()==0){
		        return "@@";
		      }
		    return str+"@";
		  }
		  return str.substring(0,2);
		}

}
