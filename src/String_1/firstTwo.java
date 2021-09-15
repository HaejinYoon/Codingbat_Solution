package String_1;

public class firstTwo {
	public String firstTwo(String str) {
		  int len=str.length();
		  if(len>=2){
		    return str.substring(0,2);
		  }
		  return str;
		}
}
