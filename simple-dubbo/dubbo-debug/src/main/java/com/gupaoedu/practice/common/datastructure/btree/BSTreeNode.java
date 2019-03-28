package com.gupaoedu.practice.common.datastructure.btree;

/**
 * Created by liuyanan on 2018-07-30.
 *
 * Binary Search Tree
 *
 * 二分查找树
 */
public class BSTreeNode {

    private int value;

    private BSTreeNode left;

    private BSTreeNode rigth;

    public BSTreeNode(){

    }
    public BSTreeNode getLeft() {
        return left;
    }

    public void setLeft(BSTreeNode left) {
        this.left = left;
    }

    public BSTreeNode getRigth() {
        return rigth;
    }

    public void setRigth(BSTreeNode rigth) {
        this.rigth = rigth;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public BSTreeNode(int value){
        this.value = value;
        this.left = null;
        this.rigth = null;
    }
    public void insert(BSTreeNode root,int value){
        if(value>=root.value){
            if(root.rigth == null){
                root.rigth = new BSTreeNode(value);
            }else {
                insert(root.rigth,value);//递归
            }
        }else if(value<root.value){
            if(root.left ==null){
                root.left = new BSTreeNode(value);
            }else{
                insert(root.left,value);//递归
            }
        }
    }
}
