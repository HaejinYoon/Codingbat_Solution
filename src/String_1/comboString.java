package String_1;

public class comboString {
	public String comboString(String a, String b) {
		int lena=a.length();
		int lenb=b.length();
		if(lena>lenb){
		    return b+a+b;
		}else
			return a+b+a;
	}
}
