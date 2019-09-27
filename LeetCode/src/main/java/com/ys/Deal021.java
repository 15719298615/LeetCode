package com.ys;

import org.junit.Test;

/**
 * 题目描述
我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？

 * @author 10249
 *使用递归的方式一直到最后
 */
public class Deal021 {
	
	@Test
	public void Demo(){
		System.out.println(RectCover(5));
	}
	
	
    public int RectCover(int target) {
    	if(target<=3){return target;}//用2也可以
    	
    	return RectCover(target-1)+RectCover(target-2);
    }
}