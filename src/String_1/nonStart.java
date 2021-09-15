package String_1;

public class nonStart {
	public String nonStart(String a, String b) {
		int lena=a.length();
		int lenb=b.length();
		return a.substring(1,lena)+b.substring(1,lenb);
	}
}
