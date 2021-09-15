package warmup_2;

public class has271 {
	public boolean has271(int[] nums) {
		int count=0;
		for(int i=0;i<nums.length-2;i++) {
			if(nums[i]+5==nums[i+1]) {
				if(nums[i+2]<=nums[i]+1&&nums[i+2]>=nums[i]-3) {
					return true;
				}
			}
		}
		return false;
	}
}
