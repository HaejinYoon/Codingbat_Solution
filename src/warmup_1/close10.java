package warmup_1;

public class close10 {
	public int close10(int a, int b) {
		if(Math.abs(10-a) == Math.abs(10-b)){
			return 0;
		} else if (10-a<10-b){
			return b;
		} else 
			return a;		
	}
}
