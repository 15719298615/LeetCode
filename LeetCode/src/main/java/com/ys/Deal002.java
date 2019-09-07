package com.ys;

import org.junit.Test;
/**
 * 454	四数相加 II

给定四个包含整数的数组列表 A , B , C , D ,计算有多少个元组 (i, j, k, l) ，使得 A[i] + B[j] + C[k] + D[l] = 0。

为了使问题简单化，所有的 A, B, C, D 具有相同的长度 N，且 0 ≤ N ≤ 500 。所有整数的范围在 -228 到 228 - 1 之间，最终结果不会超过 231 - 1 。
输入:
A = [ 1, 2]
B = [-2,-1]
C = [-1, 2]
D = [ 0, 2]
输出:
2
这是第一想到的暴力,太耗时了LeetCode不能通过 
 * @author ys
 *
 */
public class Deal002 {
	@Test
	public void fourSumCount() {
		int[] A={1,2};
		int[] B={-2,-1};
		int[] C={-1,2};
		int[] D={0,2};
		int count=0;
		for(int i=0;i<A.length;i++){
			for(int j=0;j<B.length;j++){
				for(int k=0;k<C.length;k++){
					for(int q=0;q<D.length;q++){
						if(A[i]+B[j]+C[k]+D[q]==0){
							count++;
						}
					}
				}
			}
		}
		System.out.println(count);
	}
}
