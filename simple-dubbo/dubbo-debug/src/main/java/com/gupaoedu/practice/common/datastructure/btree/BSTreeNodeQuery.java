package com.gupaoedu.practice.common.datastructure.btree;

import java.sql.PreparedStatement;

/**
 * Created by liuyanan on 2018-07-30.
 */
public class BSTreeNodeQuery {

    /**
     * 先根遍历
     * @param root
     */
    public static void preOrder(BSTreeNode root){
        if(root != null){
            System.out.print(root.getValue() + "-");
            preOrder(root.getLeft());
            preOrder(root.getRigth());
        }
    }

    public static void inOrder(BSTreeNode root) { // 中根遍历

        if (root != null) {
            inOrder(root.getLeft());
            System.out.print(root.getValue() + "--");
            inOrder(root.getRigth());
        }
    }

    public static void postOrder(BSTreeNode root) { // 后根遍历

        if (root != null) {
            postOrder(root.getLeft());
            postOrder(root.getRigth());
            System.out.print(root.getValue() + "---");
        }
    }

    /**
     *           5
     *      2           22
     *             11        44
     *                17
     */

    public static void main(String[] args) {
        int arr[] = {5,22,11,2,44,17,5};
        //PreparedStatement
        BSTreeNode bTreeNode = new BSTreeNode(5);
        for(int i :arr){
            bTreeNode.insert(bTreeNode,i);
        }
        BSTreeNodeQuery.inOrder(bTreeNode);
        System.out.println();
        BSTreeNodeQuery.preOrder(bTreeNode);
        System.out.println();
        BSTreeNodeQuery.postOrder(bTreeNode);
    }
}
