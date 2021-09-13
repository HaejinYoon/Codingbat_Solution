package warmup_2;

public class stringX {
	public String stringX(String str) {
		String result="";
		if(str.length()==0)return "";
		if(str.charAt(0)=='x')
			result+="x";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!='x') {
				result+=str.substring(i,i+1);
			}
		}
		if(str.length()>1&&str.charAt(str.length()-1)=='x')
			result+="x";
		return result;
	}
}
