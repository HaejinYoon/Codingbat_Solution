package String_1;

public class deFront {
	public String deFront(String str) {    
		  int len = str.length();
		  if(str.charAt(0)=='a'){
		    if(str.charAt(1)=='b'){
		      return "a"+"b"+str.substring(2,len);
		    }
		    return "a"+str.substring(2,len);
		  }
		  if(str.charAt(1)=='b'){
		      return "b"+str.substring(2,len);
		  }
		  return str.substring(2,len);
		}

}
