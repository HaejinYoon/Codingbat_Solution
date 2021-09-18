package String_1;

public class middleThree {
	public String middleThree(String str) {
		int len=str.length()/2;
		if(str.length()>3){
			return str.substring(len-1,len+2);
		}
		return str;
	}
}
