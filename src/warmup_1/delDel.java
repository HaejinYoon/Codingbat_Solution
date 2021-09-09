package warmup_1;

public class delDel {
	public static void main(String[] args) {
		String str = "adelbc";
		System.out.println("main : " + method(str));
		
	}
	public static String method(String str) {		
		if(str.length()<4)
			return str;
		if((str.substring(1,4)).equals("del")) {
			return str.substring(0, 1)+str.substring(4,str.length());
		}
		return str;
	}
}
