package strarr;

public class RemoveElement {
	public static int removeElement(int[]nums,int val){
		int j=0;
		for(int i=0;i<nums.length;i++){
			if(nums[i]!=val){
				
				nums[j++]=nums[i];
			}
		}
		
		return j;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums={3,2,2,3,2};
		int val=3;
		System.out.println(removeElement(nums,val));
	}

}
