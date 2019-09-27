package com.ys;

import org.junit.Test;

/**
 * 二进制中1的个数
 * 题目描述
输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。

 * @author 10249
 * 很重要的一点：：在机器中，整数的存储和运算都是其补码表示的！！！！！！！
 *	
 *
 */
public class Deal022 {
	@Test
	public void Demo(){
		System.out.println(NumberOf1(10));
		
	}
	
	
	public int NumberOf1(int n) {
		int num = 0;
		while(n!=0){
			n&=(n-1);//运算时直接就是二进制，每次那个数字减一之后，就会将本身的那一位的以变成0，当最终所有的都变成0后就可以知道
			//比如10，变成二进制后是1010当他减一后，为1001，1010&1001=1000，这时候那位1000，本来第二位的一没了num加一，之后1000&0111=0000
			//n就为0，num=2，两位一
			num++;
		}
		return num;
	}
	
}
