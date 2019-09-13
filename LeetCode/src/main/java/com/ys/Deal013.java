package com.ys;

import java.util.Arrays;
/**
 * 题目描述
输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
前序序列{1,2,4,7,3,5,6,8} 根->左->右
中序序列{4,7,2,1,5,3,8,6} 左->根->右
运用Arrays.copyOfRange()方法

Arrays.copyOfRange(T[ ] original,int from,int to)

将一个原始的数组original，从下标from开始复制，复制到上标to，生成一个新的数组。

注意这里包括下标from，不包括上标to。
 * @author 10249
 *
 */
public class Deal013 {

	public static void main(String[] args) {
		int[] pre = {1,2,4,7,3,5,6,8};
		int[] in = {4,7,2,1,5,3,8,6};
		System.out.println(reConstructBinaryTree(pre,in));
	}
	
	 public static TreeNode1 reConstructBinaryTree(int[] pre, int[] in) {
		 	if(pre.length==0||in.length==0){
		 		return null;
		 	}
	        int val = pre[0]; // 前序遍历序列中的第一个数即为根节点
	        TreeNode1 tree = new TreeNode1(val);
	 
	        int mid = 0; // 找到根节点在中序遍历中的位置
	        for (int i = 0; i <= in.length; i++) {
	            if (in[i] == val) {
	                mid = i;
	                break;
	            }
	        }
	        tree.left=reConstructBinaryTree(Arrays.copyOfRange(pre, 1, mid+1),Arrays.copyOfRange(in, 0, mid));
	        tree.right=reConstructBinaryTree(Arrays.copyOfRange(pre, mid+1, pre.length),Arrays.copyOfRange(in, mid+1, in.length));
	 
	        return tree;
	    }
}


class TreeNode1 {
    int val;
    TreeNode1 left;
    TreeNode1 right;
    TreeNode1(int x) {
        val = x;
    }
}
