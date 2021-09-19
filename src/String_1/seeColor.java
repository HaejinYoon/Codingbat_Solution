package String_1;

public class seeColor {
	public String seeColor(String str) {
		  if(str.length()<4){
		    if(str.equals("red")){
		      return str;
		    }
		    return "";
		  }
		  if(str.substring(0,3).equals("red")) {
		    return "red";
		  }
		  if(str.substring(0,4).equals("blue")) {
		    return "blue";
		  }
		  return "";
		}
}
