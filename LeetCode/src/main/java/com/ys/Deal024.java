package com.ys;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * 调整数组顺序使奇数位于偶数前面
 * 题目描述
输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。

 * @author 10249
 *
 */
public class Deal024 {
	@Test
	public void Demo(){
		int[] array = {1,2,3,4,5,6,7};
		reOrderArray(array);
		
	}
	
	
	public void reOrderArray(int [] array) {
		List<Integer> s1 = new ArrayList<>();
		List<Integer> s2 = new ArrayList<>();
		for(int i=0;i<array.length;i++){
			if(array[i]%2==0){
				s2.add(array[i]);
			}else{
				s1.add(array[i]);
			}
		}
		s1.addAll(s2);
//		for(int i=0;i<s1.size();i++){
//			System.out.println(s1.get(i));
//		}
		for(int i=0;i<array.length;i++){
			array[i]=s1.get(i);
		}
		
	}
	
}
