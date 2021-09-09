package warmup_1;

public class nearHundred {
	public boolean nearHundred(int n) {
		  if((Math.abs(100-n))<=10){
		    return true;
		  }else if  (Math.abs(200-n)<=10){
		    return true;
		  }
		  return false;
		}
}
