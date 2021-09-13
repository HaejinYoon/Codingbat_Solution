package warmup_2;

public class stringYak {
	public static void main(String[] args) {
		System.out.println(stringYak("xxxyakyyyakzzz"));
		
	}
	
	
	public static String stringYak(String str) {
		String result="";
		if(str.length()<3)return str;
		for(int i=0;i<str.length();i++) {
			System.out.println("first str: "+str);
			if(str.substring(i,i+3).equals("yak")) {
				result+=str.substring(0,i);
				str=str.substring(i+3,str.length());
				System.out.println("str: "+str);
				System.out.println("result :" + result);
			}
		}
		result+=str;
		return result;
	}
}
