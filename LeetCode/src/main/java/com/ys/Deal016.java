package com.ys;

import org.junit.Test;
/**
 * 题目描述
大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0）。

n<=39
数组
时间复杂度：O(n)
空间复杂度：O(n)

 * @author 10249
 *
 */
public class Deal016 {
	@Test
	public void Demo(){
		int n = 6;//测试用例
		int[] a = new int[40];
		a[0]=0;
		a[1]=1;
		for(int i=2;i<=n;i++){
			a[i] = a[i-1]+a[i-2];
		}
		System.out.println(a[n]);
		
		
	}
	
}
