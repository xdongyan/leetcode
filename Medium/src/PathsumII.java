
import java.util.*;
public class PathsumII {
	public static List<List<Integer>> pathSum(TreeNode root, int sum){
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		List<Integer>subresult =  new ArrayList<Integer>();
		pathSum(root,sum,result,subresult);
		return result;
				
	}
	public static void pathSum(TreeNode root, int sum,List<List<Integer>> result,List<Integer>subresult){
		if(root==null) return ;
		subresult.add(root.val);
		if(root.left!=null){
			pathSum(root.left,sum-root.val,result,subresult);
		}
		if(root.right!=null){
			pathSum(root.right,sum-root.val,result,subresult);
		}
		if(root.left==null&&root.right==null&&sum==root.val){
			result.add(new ArrayList(subresult));
			
		}
		subresult.remove(subresult.size()-1);//remove the last integer
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
