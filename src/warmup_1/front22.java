package warmup_1;

public class front22 {
	public String front22(String str) {
		  if(str.length()<3)
		  return str+str+str;
		  String fe = str.substring(0,2);
		  return fe+str+fe;
		}
}
