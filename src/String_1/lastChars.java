package String_1;

public class lastChars {
	public String lastChars(String a, String b) {
		   if(a.length()==0 && b.length()==0){
		      return "@"+"@";
		    }
		  if(a.length()<2 ||b.length()<2){
		    if(a.length()==0){
		      return "@"+b.substring(b.length()-1,b.length());
		    }
		    if(b.length()==0){
		      return a.substring(0,1)+"@";
		    }
		   
		  }
		  
		  return a.substring(0,1)+b.substring(b.length()-1,b.length());
		}

}
