package warmup_2;

public class frontTimes {
	public String frontTimes(String str, int n) {
		String result="";
		for(int i=0;i<n;i++){
			if(str.length()<3) {
				result += str.substring(0,str.length());
			} else {
				result += str.substring(0,3);				
			}
		}
		return result;
	}
}
