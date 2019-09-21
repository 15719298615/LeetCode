package com.ys;

import org.junit.Test;
/**
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 * @author 10249
 *
 */
public class Deal020 {
	@Test
	public void ss(){
		System.out.println(JumpFloorII(6));
	}
	
  public int JumpFloorII(int target) {
      int sum = 1;
      if(target==0){
    	  return 0;
      }
      for(int i=1;i<target;i++){
    	  sum = sum*2;
      }
      return sum;
  }
}
