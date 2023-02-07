package FindLargestNumber;

public class LargestNumFromArray {

	public static void main(String[] args) {
		
		
		int[]nums={12,1,3,5,7,8,2342,1};

		int largest=nums[0];

		for(int i=0;i<nums.length;i++){

		if(nums[i]>largest){

		largest=nums[i];

		}

		}


		System.out.println(largest);

	}

}
