package warmup_1;

public class in3050 {
	public boolean in3050(int a, int b) {
		if(a<=50 && b<=50){
			if(a/10==b/10){
				return true;
			} else {
				if((a==40 || b==40) || (a==50 || b==50)){
					if(Math.abs(a-b)>10){
						return false;
					}
					return true;
				}
			}
			return false;
		}
		return false;		
	}
}
