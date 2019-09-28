package com.ys;

import org.junit.Test;

/**
 * 数值的整数次方
 * 题目描述
给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。

保证base和exponent不同时为0

 * @author 10249
 *
 */
public class Deal023 {
	
	@Test
	public void Demo(){
		System.out.println(Power(2,3));
		
		
	}
	
	
  public double Power(double base, int exponent) {
	  if(base==0){
		  return 0;
	  }
	  double num = 1;
	  int e = exponent>0?exponent:-exponent;
	  for(int i=1;i<=e;i++){
		  num*=base;
	  }
	  return exponent>0?num:1/num;
		  
	  
  }
	
}
