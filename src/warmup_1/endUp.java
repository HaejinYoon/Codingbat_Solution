package warmup_1;

public class endUp {
	public String endUp(String str) {
		if(str.length()<3){
		    return str.toUpperCase();
		} else {
		    String a = str.substring(0,str.length()-3)+ str.substring(str.length()-3,str.length()).toUpperCase();
		    return a;
		}
	}
}
