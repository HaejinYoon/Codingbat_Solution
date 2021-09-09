package warmup_1;

public class backAround {
	public String backAround(String str) {
		  if(str.length()<2)
		  return str+str+str;
		  else
		  return str = str.charAt(str.length()-1)+str+str.charAt(str.length()-1);
		}
}
