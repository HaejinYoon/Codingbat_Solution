package warmup_2;

public class noTriples {
	public static void main(String[] args) {
		int[] arr= {1,1,2,2,2,1};
		System.out.println(noTriples(arr));
	}
	public static boolean noTriples(int[] nums) {
		int count=0;
		for(int i=0;i<nums.length-1;i++) {
			if(nums[i]==nums[i+1]) {
				count++;
				if(count==2) {
					return false;
				}
			}else {
				count=0;
			}
		}
		return true;
	}
}
	

