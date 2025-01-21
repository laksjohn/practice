package com.example.ds;

import com.example.solution.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeStudy {


    List<Integer> result = new ArrayList<>();

    public List<Integer> preorderTraversal(TreeNode root) {

        if (root != null) preOrder(root);
        return result;
    }

    public void preOrder(TreeNode root) {

        if (root == null) return;
        result.add(root.val);
        if (root.left != null) preOrder(root.left);
        if (root.right != null) preOrder(root.right);
    }

    public List<Integer> inorderTraversal(TreeNode root) {

        if(root!=null) inOrder(root);
        return result;
    }

    public void inOrder(TreeNode root){

        if(root==null) return;
        if(root.left!=null) inOrder(root.left);
        result.add(root.val);
        if(root.right!=null) inOrder(root.right);

    }

    public List<Integer> postorderTraversal(TreeNode root) {

        if(root!=null) postOrder(root);

        return result;
    }

    public void postOrder(TreeNode root){
        if(root==null) return;
        if(root.left!=null) postOrder(root.left);
        if(root.right!=null) postOrder(root.right);
        result.add(root.val);
    }

}
