package warmup_2;

public class stringYak {
	public static void main(String[] args) {
		System.out.println(stringYak("HiyakHi"));
		System.out.println(stringYak("xxxyakyyyakzzz"));
		System.out.println(stringYak("yakxxxyak"));
		System.out.println(stringYak("yak123ya"));
		
	}
	
	
	public static String stringYak(String str) {
		String result="";
		for(int i=0;i<str.length();i++) {
			if(i+2<str.length() && str.charAt(i)=='y'&&str.charAt(i+2)=='k') {
				i+=2;
			}else {
				result+=str.charAt(i);
			}
		}
		return result;
	}
}


//		String result="";
//		int tmp=0;
//		for(int i=0;i<str.length()-2;i++) {
//			System.out.println(i);
//			if(str.substring(i,i+3).equals("yak")) {
//				i+=2;
//				if(i==str.length()) {
//					break;
//				}
//				System.out.println("2i: "+i);
//			}else {
//				result+=str.substring(i,i+1);
//				System.out.println("1: "+result);
//				if(i>=str.length()-3) {
//					result+=str.substring(str.length()-2,str.length());
//					System.out.println("2: "+result);
//				}
//			}
//		}
//		return result;

//		String result="";
//		int count=0;
//		if(str.length()<3)return str;
//		for(int i=0;i<str.length()-2;i++) {
//			System.out.println(i);
//			if(str.substring(i,i+3).equals("yak")) {
//				if(count==0) {
//					result+=str.substring(0,i);
//					System.out.println("result :" + result);
//					System.out.println("str: "+str);
//				}
//				
//				if(count>0) { 
//					result+=str.substring(i,i+3);
//					System.out.println("result :" + result);
//					
//					System.out.println("str: "+str);
//				}
//				count++;
//			}
//		}
//		result+=str;
//		return result;