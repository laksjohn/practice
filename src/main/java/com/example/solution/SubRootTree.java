package com.example.solution;

public class SubRootTree {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {

        if(root==null) return false;
        if(subRoot==null) return true;

        if(isSameTree(root,subRoot)) return true;

        return isSubtree(root.left,subRoot)||isSubtree(root.right,subRoot);
    }

    private boolean isSameTree(TreeNode first, TreeNode second) {

        if(first==null && second==null) return true;
        if(first==null||second==null||first.val!=second.val) return false;

        return isSameTree(first.left,second.left)&& isSameTree(first.right,second.right);


    }


}
