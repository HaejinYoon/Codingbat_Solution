package String_2;

public class countCode {
	public int countCode(String str) {
		  int result = 0;
		  for(int i=0;i<str.length()-3;i++){
		    if(str.substring(i,i+2).equals("co")){
		      if(str.substring(i+3,i+4).equals("e")){
		        result+=1;
		      }
		    }
		  }
		  return result;
		}
}
