package com.ys;

import java.util.Arrays;

import org.junit.Test;

/**
 * 旋转数组的最小数字
 * 题目描述
把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。

 * @author 10249
 *
 */
public class Deal015 {
	@Test
	public void demo(){
		int[] array = {3,4,5,1,2};//测试用例
		//System.out.println(minNumberInRotateArray(array));
		System.out.println(minNumberInRotateArray1(array));
	}
	
//	//方法一
//  public int minNumberInRotateArray(int [] array) {
//	  int n = array.length;
//	if(n==0){
//		return 0;
//	}
//	
//	Arrays.sort(array);//运用Arrays的soet（）方法自动排序
//	  return array[0];
//	  
//  }
  
  	//方法二
   public int minNumberInRotateArray1(int [] array) {
          int n = array.length;
          if(n == 0){
              return 0;
          }
          for(int i=0;i<n-1;i++){
              if(array[i] >array[i+1]){//因为是非递减排序的数组所以i+1若小于i则i+1肯定为最小的值
                  return array[i+1];
              }
          }
          return array[0];
      }
}
