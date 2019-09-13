package com.ys;
/**
 * 题目描述
输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
前序序列{1,2,4,7,3,5,6,8} 根->左->右
中序序列{4,7,2,1,5,3,8,6} 左->根->右
 * @author 10249
 *
 */
public class Deal012 {
	
	public static void main(String[] args) {
		int[] pre = {1,2,4,7,3,5,6,8};//测试用例
		int[] in = {4,7,2,1,5,3,8,6};
		System.out.println(reConstructBinaryTree(pre,in));
		
		
	}
	
	public static TreeNode reConstructBinaryTree(int [] pre,int [] in) {
			int lenPre = pre.length;
	        int lenIn = in.length;
	        if (lenPre == 0) {
	            return null;
	        }
	 
	        return build(pre, in, 0, lenPre-1, 0, lenIn-1);
		
    }
	//递归调用
	public static TreeNode build(int [] pre,int [] in,int preL,int preR,int inL,int inR){
		 if (preL > preR || inL > inR) { // 无左子树或右子树
	            return null;
	        }
		int val = pre[preL];//把前序的第一个（根节点）赋给val
		TreeNode tree = new TreeNode(val);
		
		int mid = 0;
		for(int i=0;i<=inR;i++){
			if(in[i]==val){//在中序中找到那个根节点，获得他的位置
				mid = i;
				break;
			}
		}
		
		int leftCount = mid-inL;//得到左子树节点的个数
		int rightCount = inR-mid;//右子树节点的个数
		
		tree.left = build(pre,in,preL+1,preL+leftCount,inL,mid-1);//左子树递归
		tree.right = build(pre,in,preR-rightCount+1,preR,mid+1,inR);//右子树递归
		
		return tree;
	}
	
}

class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }