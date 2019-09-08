package com.ys;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
/**
 * 找到给定字符串（由小写字符组成）中的最长子串 T ， 要求 T 中的每一字符出现次数都不少于 k 。输出 T 的长度。

示例 1:

输入:
s = "aaabb", k = 3

输出:
3

最长子串为 "aaa" ，其中 'a' 重复了 3 次。

示例 2:

输入:
s = "ababbc", k = 2

输出:
5

最长子串为 "ababb" ，其中 'a' 重复了 2 次， 'b' 重复了 3 次。

思路：使用递归和分治法
 * @author 10249
 *
 */
public class Deal006 {
	public int re = 0;//定义一个最大值，初始化为0
	@Test
	public void longestSubstring(){
		String s = "aaabcbcb";
		int k = 3;//测试用例
		getlongest(s, k);//调用递归函数
    	System.out.println(re);
		
    	
    	
	}
	
	 public void getlongest(String s, int k) {	// 分治
	    	int len = s.length();
	    	if(len == 0) return;

	    	int[] count = new int[26];
	    	for(char c : s.toCharArray()) {
	    		count[c-'a']++;//记录每个字母出现的次数
	    	}

	    	int l = 0;
	    	boolean greater = true;   // 记录是否所有字符个数都 > k
	    	// 进行分隔处理判断循环
	    	for(int i = 0; i < len; i++) {
	    		//如果所有的字母出现的次数都大于k则不执行下面的if语句
	    		if(count[s.charAt(i) - 'a'] != 0 && count[s.charAt(i) - 'a'] < k) {		
				if(i > l) {//判断要被分隔的字符串是否为一个，如果为一个就没有必要再递归
	                getlongest(s.substring(l, i), k);//因为有字母出现次数小于k，所以从那个小于k的字母的位置继续分隔，以此类推
	            }
				greater = false;//把记录是否所有字符个数都 > k设为false
	                        l = i + 1;//把分隔位置记录下来
	    		}
	    	}
	    	//判断是否被分割了，并且总体的长度大于分隔位置，因为上面的l+1了，所以如果被分割的右边为一个也没必要再递归
	    	//如果满足条件，就开始在对右边的字符串做同样的递归操作
	    	if(!greater && len > l) getlongest(s.substring(l, len), k);
	    	if(greater) {//知道最终不用分隔
	    		re = Math.max(re, len);//re为每次递归的最大长度，最终返回所有递归中的最大长度re
	    	}
	    }
}
