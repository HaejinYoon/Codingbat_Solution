package warmup_1;

public class stringE {
	public boolean StringE(String str) {
		int count = 0;
		for (int i=0;i<str.length();i++){
			if(str.charAt(i)=='e'){
				count+=1;
			}
		}
		if (count==1) return true;
		else if(count==3) return true;
		else return false;
	}
	
	public boolean StringERegex(String str) {
		// return java.util.regex.Pattern.matches(".*e{1,3}.*?^e", str);
		return java.util.regex.Pattern.matches("[^e]*e[^e]*e?[^e]*e?[^e]*", str);
	}
}
