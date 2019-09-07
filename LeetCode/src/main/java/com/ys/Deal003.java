package com.ys;

import java.util.HashMap;
import java.util.Map;
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
使用了n^2做了两次，通过
执行用时 :223 ms
内存消耗 :73.4 MB
 * @author ys
 *
 */


public class Deal003 {
	
	
	public void fourSumCount() {
		int[] A={1,2};//测试数据
		int[] B={-2,-1};
		int[] C={-1,2};
		int[] D={0,2};
		Map<Integer,Integer> map = new HashMap<>();//创建一个Map
		for(int i=0;i<A.length;i++){
			for(int j=0;j<B.length;j++){
				int sum1 = A[i]+B[j];//循环两次的和，把这个值当作map的key，把出现的次数当作value
				if(map.containsKey(sum1)){//在map中每次循环都查找有没有这个值
					map.put(sum1, map.get(sum1)+1);//如果有则value+1，代表出现次数加一
				}else{
					map.put(sum1, 1);//如果没有，则把这个数放进去，并且出现次数为1
				}
				}
			}
		
		
		int count=0;
		for(int k=0;k<C.length;k++){
			for(int q=0;q<D.length;q++){
				int sum2 = -(C[k]+D[q]);//循环两次的和，并且赋为负值
				if(map.containsKey(sum2)){//如果这个和的负值map中有的话，那么sum2和sum1的和就为0
					count+=map.get(sum2);//那么sum1出现几次，就有多少次四数和为0
				}
			}
		}
		
		System.out.println(count);
		}
	}

