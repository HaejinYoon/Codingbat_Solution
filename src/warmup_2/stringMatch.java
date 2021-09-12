package warmup_2;

public class stringMatch {
	public int stringMatch(String a, String b) {
		int count=0;
		int lena=a.length();
		int lenb=b.length();
		if(lena<=lenb) {
			for(int i=0;i<a.length()-1;i++) {
				if(a.substring(i,i+2).equals(b.substring(i, i+2))) {
					count++;
				}
			}
		}
		if(lena>lenb) {
			for(int i=0;i<b.length()-1;i++) {
				if(a.substring(i,i+2).equals(b.substring(i, i+2))) {
					count++;
				}
			}
		}
		return count;
	}
}
