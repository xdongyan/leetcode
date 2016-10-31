package strarr;
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class SumOfLeftLeaves {
	public int sumOfLeftLeaves(TreeNode root){
		int sum=0;
		if(root==null) return 0;
		if(root.left!=null){
			if(root.left.left==null&&root.left.right==null) sum+=root.left.val;//if root.left.left==null,+root.left.val
			else sum+=sumOfLeftLeaves(root.left);//root.left is not null,go to root.left
		}
		if(root.right!=null){
			sum+=sumOfLeftLeaves(root.right);
				
			}
		return sum;}
	}

