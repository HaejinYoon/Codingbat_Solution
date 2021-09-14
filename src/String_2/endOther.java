package String_2;

public class endOther {
	public boolean endOther(String a, String b) {
		  a=a.toLowerCase();
		  b=b.toLowerCase();
		  int lena=a.length();
		  int lenb=b.length();
		  
		  if(a.equals(b)) return true;
		  if(lena>lenb){
		    if(a.substring(lena-lenb,lena).equals(b)) return true;
		  }else if(lena<lenb)
		    if(b.substring(lenb-lena,lenb).equals(a)) return true;
		  
		  return false;
		 
		}
}
