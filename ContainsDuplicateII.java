package strarr;

public class ContainsDuplicateII {
public static boolean isseven(int[]nums,int k){
	int[][]result=new int[1][1];
	for(int i=0;i<nums.length;i++){
		for (int j=1;j<nums.length;j++){
			if(j-i>=k) return  true ;
		}
	}
	return false;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]nums={1,2,3,4,5,6,7};
int k=7;
 System.out.println(isseven(nums,k));
	}

}
