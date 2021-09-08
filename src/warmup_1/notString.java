package warmup_1;

public class notString {
	public String notString(String str) {
		  int len = str.length();
		  if(len >= 3){
		    char c1 = str.charAt(0);
		    char c2 = str.charAt(1);
		    char c3 = str.charAt(2);
		    if(c1=='n'&&c2=='o'&&c3=='t'){
		      return str;
		    }
		    
		  }
		  return "not "+str;
		}

}
