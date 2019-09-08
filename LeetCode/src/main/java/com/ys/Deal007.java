package com.ys;

import org.junit.Test;

/**
 *  找到给定字符串（由小写字符组成）中的最长子串 T ， 要求 T 中的每一字符出现次数都不少于 k 。输出 T 的长度。

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
执行用时 :1 ms, 在所有 Java 提交中击败了100.00% 的用户
内存消耗 :34.6 MB, 在所有 Java 提交中击败了83.69%的用户

思路：使用递归和分治法
 * @author 10249
 *
 */
public class Deal007 {
	@Test
	  public void longestSubstring() {
		  
		  	String s = "aaabcbcb";
			int k = 3;//测试用例
	        int len = s.length();
	        if (len == 0 || k > len){ System.out.println(0);}
	        if (k < 2)  System.out.println(len);

	        System.out.println(count(s.toCharArray(), k, 0, len - 1)); 
	    }
	
	  private static int count(char[] chars, int k, int p1, int p2) {
	        if (p2 - p1 + 1 < k) return 0;
	        int[] times = new int[26];  //  26个字母
	        //  统计每个字母的出现次数
	        for (int i = p1; i <= p2; ++i) {
	            ++times[chars[i] - 'a'];
	        }
	        //  如果该字符出现频次小于k，就不可能出现在结果子串中
	        //  分别排除，然后挪动两个指针
	        
	        while (p2 - p1 + 1 >= k && times[chars[p1] - 'a'] < k) {
	            ++p1;//p1向后
	        }
	        while (p2 - p1 + 1 >= k && times[chars[p2] - 'a'] < k) {
	            --p2;//p2向前
	        }

	        if (p2 - p1 + 1 < k) return 0;//如果最终的p1和p2比k还小就没有结果
	        //  得到临时子串，再递归处理
	        for (int i = p1; i <= p2; ++i) {
	            //  如果第i个不符合要求，分成左右两段分别继续递归
	            if (times[chars[i] - 'a'] < k) {
	                return Math.max(count(chars, k, p1, i - 1), count(chars, k, i + 1, p2));
	            }
	        }
	        return p2 - p1 + 1;//最终输出最长字串长度
	    }
}
