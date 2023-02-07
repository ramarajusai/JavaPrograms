package FindLargestNumber;

import java.util.Arrays;

public class SecondLargestNumber {

	public static void main(String[] args) {

		
		int[]nums={12,1,3,5,7,8,2342,1};


		Arrays.sort(nums);

		System.out.println(nums[nums.length-2]);

	}

}
