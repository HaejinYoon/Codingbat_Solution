package warmup_1;

public class everyNth {
	public String everyNth(String str, int n) {
		  String a="";
		  for(int i=0;i<str.length();i+=n){
		    a += str.substring(i,i+1);
		  }
		  return a;
		}
}
