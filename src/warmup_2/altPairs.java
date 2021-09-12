package warmup_2;

public class altPairs {
	public String altPairs(String str) {
		String result="";
		for(int i=0;i<str.length();i+=4) {
			result+=str.substring(i,i+1);
			if(i+2<=str.length()){
			  result+=str.substring(i+1,i+2);
			}
		}
		return result;
	}
}
