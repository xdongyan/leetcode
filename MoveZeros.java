package strarr;

public class MoveZeros {
public static void movezeros(int[]nums){
	int counts=0;
	for(int i=0;i<nums.length;i++){
		if(nums[i]==0) counts++;//count how many 0s
		else{
			nums[i-counts]=nums[i];//none 0integers shifts to left places which equals how many0 infornt of they.
		}
		
	}
	while(counts>0){
		nums[nums.length-counts]=0;//adding the zeros from the back of the array;
		counts--;
	}
	for(int j=0;j<nums.length;j++){
		System.out.println(nums[j]);
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]nums={0,1,2,10,0,0};
	movezeros(nums);
	}

}
