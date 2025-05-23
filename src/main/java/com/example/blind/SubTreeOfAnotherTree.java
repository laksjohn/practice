package com.example.blind;

import com.sun.source.tree.Tree;

public class SubTreeOfAnotherTree {

    /**
     * Definition for a binary tree node.
     **/
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {

        if (root == null)
            return false;

        if (root.val == subRoot.val && isSametree(root, subRoot))
            return true;

        return isSubtree(root.left,subRoot)||isSubtree(root.right,subRoot);


    }

    public boolean isSametree(TreeNode t1,TreeNode t2){
        if(t1==null&&t2==null) return true;
        if(t1==null||t2==null||t1.val!=t2.val){
            return false;
        }

        return(isSametree(t1.left,t2.left)&&isSametree(t1.right,t2.right));
    }

}
