package String_1;

public class minCat {
	public String minCat(String a, String b) {
		  int lena= a.length();
		  int lenb= b.length();
		  
		  if(lenb<lena){
		    return a.substring(lena-lenb)+b;
		  }
		  if(lenb>lena){
		    return a+b.substring(lenb-lena);
		  }
		  return "";
		}
}
