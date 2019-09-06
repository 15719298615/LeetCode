package com.ys;

import org.junit.Test;
/**
 * 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
示例 1：
输入: "babad"
输出: "bab"
注意: "aba" 也是一个有效答案。
示例 2：
输入: "cbbd"
输出: "bb
使用中心扩展算法
 * @author ys
 *
 */
public class Deal{

	public static void main(String[] args) {
		String s1 = "ababa";
		String longest = longest(s1);
		System.out.println(longest);
	}
	
public static String longest(String s) {
    if (s == null || s.length() < 1) {
    	return "";//如果s为空串则返回空字符产
    }
    //设定初始回文长度为零
    int start = 0, end = 0;
    //循环整个字符串
    for (int i = 0; i < s.length(); i++) {
        int len1 = HowLong(s, i, i);//从一个位置（i）向两边扩散进行对比，得到以I为中心的最长回文的长度
        int len2 = HowLong(s, i, i + 1);//从两个位置（i，i+1）向两边扩撒，先比较这两个位置是否相同，相同继续扩散，得到以I，I+1为中心的最长回文的长度
        int len = Math.max(len1, len2);//比较两种扩散方式最长的会问的长度
        if (len > end - start) {//如果得到的最长回文的长度大于上次的最大长度
            start = i - (len - 1) / 2;//就重新以这次的I为中心设定开始
            end = i + len / 2;//重新以这次的I为中心设定结束
        }
    }
    return s.substring(start, end + 1);//最终用得到的最长的开始和结尾切开字符串
}

private static int HowLong(String s, int left, int right) {
    int L = left, R = right;//一左一右
    //如果满足L大于零且R小于字符串长的，且字符串的L和R的位置的字符相同，则向两边扩散，继续循环
    //直到不满足条件则之前的R和L就是以这个点·或者两个点为中心扩散的最长回文的起始和结尾
    while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
        L--;
        R++;
    }
    return R - L - 1;//返回长度
}


	
	
}
