package String_1;

public class conCat {
	public String conCat(String a, String b) {
		  if(a.length()==0) return b;
		  if(b.length()==0) return a;
		  if(a.charAt(a.length()-1) == b.charAt(0)){
		    return a+b.substring(1,b.length());
		  }
		  return a+b;
		}

}
