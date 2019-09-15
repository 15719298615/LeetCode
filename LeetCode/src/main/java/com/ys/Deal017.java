package com.ys;

import org.junit.Test;
/**
 * 题目描述
大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0）。
时间复杂度：O(n)
空间复杂度：O(1)
n<=39

 * @author 10249
 *
 */
public class Deal017 {
	@Test
	public void Demo(){
		int n = 6;//测试用例
		int a = 0;
		int b = 1;
		while(n-->0){
			a=a+b;
			b=a-b;
		}
		System.out.println(a);
		
	}
}
