package com.ys;
/**
 * 调整数组顺序使奇数位于偶数前面
 * 题目描述
输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。

 * @author 10249
 *交换排序的方式
 */
public class Deal025 {
	
	public void reOrderArray(int [] array) {
        if(array==null || array.length ==0){
        	return ;
        }
        int m = 0;//定义一个值，这个值可以用来记录交换的次数
       for(int i=0;i<array.length;i++){
        if((Math.abs(array[i]))%2!=0){
         int tmp = array[i];
         int j=i;
         while(j>m){//如果j大于m就继续交换，就可以把奇数全都交换到前面去
             array[j] = array[j-1];
             j--;
         }
         m=j+1;
         array[j] = tmp;
        }
		
	}
	}
}
