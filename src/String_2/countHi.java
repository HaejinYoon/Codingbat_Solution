package String_2;

public class countHi {
	public int coundHi(String str) {
		int result = 0;
		for(int i=0; i<str.length()-1; i++){
			if(str.charAt(i)=='h' && str.charAt(i+1)=='i'){
				result+=1;
			}
		}
		return result;		
	}
}
