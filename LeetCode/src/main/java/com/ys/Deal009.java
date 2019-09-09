package com.ys;
/**
 * 请实现一个函数，将一个字符串中的每个空格替换成“%20”。例如，当字符串为We Are Happy.
 * 则经过替换之后的字符串为We%20Are%20Happy。
 * @author 10249
 *
 */
public class Deal009 {
	public static void main(String[] args) {
		StringBuffer s = new StringBuffer("we are happy");
		s.toString().replace(" ", "%20");
		System.out.println(s);
		
	}
	
}
