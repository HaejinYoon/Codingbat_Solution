package String_1;

public class endsLy {
	public boolean endsLy(String str) {
		if(str.length()>=2){
		    String end = str.substring(str.length()-2);
		    return end.equals("ly");
		}
		return false; 
	}
}
