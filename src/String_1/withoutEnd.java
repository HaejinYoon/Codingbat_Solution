package String_1;

public class withoutEnd {
	public String withoutEnd(String str) {
		  int len=str.length();
		  if(len>=2){
		    return str.substring(1,len-1);
		  }
		  return str;
		}
}
