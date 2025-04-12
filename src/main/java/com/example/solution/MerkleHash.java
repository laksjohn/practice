package com.example.solution;

public class MerkleHash {

    public boolean isSubtree(TreeNode s, TreeNode t) {

        String sHash = getMerkleHash(s);
        String tHash = getMerkleHash(t);

        return sHash.contains(tHash);

    }

    private String getMerkleHash(TreeNode s) {

        if(s==null) return "#";

        String leftHash = getMerkleHash(s.left);
        String rightHash = getMerkleHash(s.right);

        return s.val+","+leftHash+","+rightHash;
    }


}
