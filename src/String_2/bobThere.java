package String_2;

public class bobThere {
	public boolean bobThere(String str) {
		for(int i=0;i<str.length()-2;i++){
			if(str.length()<3) return false;
			if(str.charAt(i)=='b'){
				if(str.charAt(i+2)=='b'){
					return true;
				}
			}
		}
		return false;
	}
}
