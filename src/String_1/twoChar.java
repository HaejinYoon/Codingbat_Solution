package String_1;

public class twoChar {
	public String twoChar(String str, int index) {
		  int len=str.length();
		  if(len>=index+2&&index>0){
		    return str.substring(index,index+2);
		  }else {
		    return str.substring(0,2);
		  }
		}
}
