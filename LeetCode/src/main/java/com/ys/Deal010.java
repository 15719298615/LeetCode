package com.ys;
/**
 * 请实现一个函数，将一个字符串中的每个空格替换成“%20”。例如，当字符串为We Are Happy.
 * 则经过替换之后的字符串为We%20Are%20Happy。
 * @author 10249
 *
 */
public class Deal010 {
	public static void main(String[] args) {
		StringBuffer s = new StringBuffer("we are happy");
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)==' '){
				s.replace(i, i+1, "%20");
			}
			
			
		}
		System.out.println(s.toString());
	}
}
