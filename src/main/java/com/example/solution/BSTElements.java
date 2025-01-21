package com.example.solution;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BSTElements {

    List<Integer> result = new ArrayList<>();


    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {



        if(root1!=null) inorder(root1);
        if(root2!=null) inorder(root2);

        Collections.sort(result);
        return result;

    }

    public void inorder(TreeNode root){
        if(root.left!=null) inorder(root.left);
        result.add(root.val);
        if(root.right!=null) inorder(root.right);
    }
}
