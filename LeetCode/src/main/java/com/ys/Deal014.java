package com.ys;

import java.util.Stack;

import org.junit.Test;
/**
 * 用两个栈实现队列
 * 题目描述
用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。

 * @author 10249
 *
 */
public class Deal014 {
	
	Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    @Test
    public void demo() {
    	push(1);//测试用例
    	push(2);
    	System.out.println(pop());
	}
    
    public void push(int node) {
    	stack1.push(node);
    }
    
    public int pop() {
    	if(stack2.size()<=0){
    		while(stack1.size()!=0){
    			stack2.push(stack1.pop());
    		}
    	}
    	return stack2.pop();
    }
	
}
