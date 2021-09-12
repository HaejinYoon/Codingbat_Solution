package warmup_2;

public class stringSplosion {
	public String stringSplosion(String str) {
		String result="";
		int i=0;
		while(i<str.length()) {
			result+=str.substring(0, i+1);
			i+=1;
		}	
		return result;
	}

}
