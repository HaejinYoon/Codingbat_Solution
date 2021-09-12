package warmup_2;

public class stringX {
	public String stringX(String str) {
		String result="";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!='x') {
				result+=str.substring(i,i+1);
			}
		}
		return result;
	}
}
