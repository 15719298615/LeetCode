package com.ys;

import java.util.ArrayList;
import java.util.List;
/**
 * 题目描述
输入一个链表，按链表从尾到头的顺序返回一个ArrayList。

 * @author 10249
 *
 */
public class Deal011 {
	
	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		l1.next=new ListNode(2);//测试用例
		l1.next.next = new ListNode(3);
		
		System.out.println(printListFromTailToHead(l1));
		
	}
	
	//非递归方式（递归同理），利用栈的方式
  public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
	  List<Integer> list = new ArrayList<>();//定义list
	  while(listNode!=null){//如果链表不为空继续添加
		  list.add(0, listNode.val);//add(0, listNode.val)方法每次把节点的值都插入0，上次插入的则自动后退
		  listNode=listNode.next;//把节点赋为下一个
	  }
	  return (ArrayList<Integer>) list;
	  
    }
}

class ListNode {//定义链表
		int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }