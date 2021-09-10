package warmup_1;

import java.util.Arrays;

public class intMax{
	public int intMax(int a, int b, int c) {
		int[] arr = {a, b, c};
		Arrays.sort(arr);
		return arr[2];
	}
}
