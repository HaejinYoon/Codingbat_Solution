package warmup_2;

public class arrayFront9 {
	public boolean arrayFront9(int[] nums) {
		if(nums==null)
			return false;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]==9) {
				if(i<4) {
					return true;
				}
			}
		}
		return false;
	}
}
