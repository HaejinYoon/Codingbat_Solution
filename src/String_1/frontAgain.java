package String_1;

public class frontAgain {
	public boolean frontAgain(String str) {
		  int len = str.length();
		  if(len<2) return false;
		  if(str.substring(0,2).equals(str.substring(len-2,len))){
		    return true;
		  }
		  return false;
		}
}
