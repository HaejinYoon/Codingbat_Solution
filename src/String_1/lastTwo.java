package String_1;

public class lastTwo {
	public String lastTwo(String str) {
		  int len = str.length();
		  if(len<2) return str;
		  return str.substring(0,len-2)+str.charAt(len-1)+str.charAt(len-2);
		}

