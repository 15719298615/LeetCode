package com.ys;

import org.junit.Test;

/**
 * 题目描述
一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
本质还是斐波那契数列
 * @author 10249
 *
 */
public class Deal018 {
	@Test
	public void  Demo1(){
		System.out.println(Demo(5));
	}
	
	public int Demo(int terget){
		if(terget==1){return 1;}
		if(terget==2){return 2;}
		if(terget==3){return 3;}
		return Demo(terget-1)+Demo(terget-2);
	}
	
}
