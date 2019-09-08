package com.ys;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
/**
 * 写一个程序，输出从 1 到 n 数字的字符串表示。

1. 如果 n 是3的倍数，输出“Fizz”；

2. 如果 n 是5的倍数，输出“Buzz”；

3.如果 n 同时是3和5的倍数，输出 “FizzBuzz”。
示例：

n = 15,

返回:
[
    "1",
    "2",
    "Fizz",
    "4",
    "Buzz",
    "Fizz",
    "7",
    "8",
    "Fizz",
    "Buzz",
    "11",
    "Fizz",
    "13",
    "14",
    "FizzBuzz"
]

 * @author 10249
 *
 */
public class Deal005 {
	@Test
	 public void fizzBuzz() {
		int n=15;
		List<String> list = new ArrayList<>();
		for(int i=1;i<=n;i++){
			if(i%15==0){
				list.add("FizzBuzz");
			}else if(i%5==0){
				list.add("Buzz");
			}else if(i%3==0){
				list.add("Fizz");
			}else{
				list.add(String.valueOf(i));
			}
		}
		 System.out.println(list);
		 
	 }
}
