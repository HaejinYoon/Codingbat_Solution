package warmup_1;

public class mixStart {
	public boolean mixStart(String str) {
		  if(str.length()<3){
		    return false;
		  } else if((str.substring(0,3).equals("mix"))){
		    return true;
		  }else if((str.substring(1, 3).equals("ix"))) {
		    return true;
		  }else
		  return false;
		}
	public boolean mixStartRegex(String str) {
		return java.util.regex.Pattern.matches(".ix.*", str);
	}
}
