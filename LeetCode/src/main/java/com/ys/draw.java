package com.ys;

public class draw {
	
	public static void main(String[] args) {
		String s = "00110011";
		System.out.println(print(s));
	}
	public static StringBuffer print(String str){
		StringBuffer newStr = new StringBuffer();
		 for (int i = 0; i < str.length() ; i++) {
			 if(str.charAt(i)=='0'){
				 newStr.append("__|￣  ");
			 }else if(str.charAt(i)=='1'){
				 newStr.append("￣|__  ");
			 }
		 }
		return newStr;
	}
	
}
