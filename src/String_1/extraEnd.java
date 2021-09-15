package String_1;

public class extraEnd {
	public String extraEnd(String str) {
		int len=str.length();
		if(str.length()>=2){
			return str.substring(len-2,len)+str.substring(len-2,len)+str.substring(len-2,len);
		}
		return str;
	}
}
