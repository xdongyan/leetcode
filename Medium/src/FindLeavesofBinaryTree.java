import java.util.*;
public class FindLeavesofBinaryTree {
	public static List<List<Integer>> findLeaves(TreeNode root){
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		//
		while(root!=null){
			List<Integer>leaves = new ArrayList<Integer>();
			if(findLeaves(root,leaves)) root=null;
				res.add(leaves);
			
		}
		return res;
	}
	public static boolean findLeaves(TreeNode root, List<Integer>leaves){
		if(root.left==null&&root.right==null){
			leaves.add(root.val);
			return true;
		}
		if(root.left!=null){
			if(findLeaves(root.left,leaves)) root.left=null;
		}
		if(root.right!=null){
			if(findLeaves(root.right,leaves)) root.right=null;
		}
		return false;
	}
}
