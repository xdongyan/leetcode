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

public class SameTree {
	public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null&&q==null)return true;
        if(p==q) return true;
        if((p==null&&q!=null)||(p!=null&&q==null)||(p.val!=q.val)) return false;
        return(isSameTree(p.left,q.left)&&isSameTree(p.right,q.right));
    }
}
