package com.example.solution;

import java.util.LinkedList;
import java.util.Queue;
import com.example.solution.TreeNode;

public class InvertTree {

    public TreeNode invertTree(TreeNode root){
        if(root==null) return null;

        TreeNode node = new TreeNode(root.val);
        node.right=invertTree(root.left);
        node.left=invertTree(root.right);

        return node;
    }

    public TreeNode invertTreeBreadth(TreeNode root){

        if(root==null) return null;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            TreeNode temp = node.left;
            node.left=node.right;
            node.right=temp;
            if(node.left!=null) queue.offer(node.left);
            if(node.right!=null) queue.offer(node.right);
        }

        return root;

    }


}
