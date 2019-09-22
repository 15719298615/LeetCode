package com.ys;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

public class Test extends JFrame{
	//测试编码
	String str = "00110011";
	public Test()
	{
		setSize(600,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}
	public void paint(Graphics g)
	{
		g.setColor(Color.black);
		g.drawLine(0,150,600,150);
		int num = 60;
		for(int i=0;i<str.length();i++){
			 if(str.charAt(i)=='0'){
				 g.drawLine(i*num,150+30,i*num+30,150+30);
				 g.drawLine(i*num+30, 150+30, i*num+30, 150-30);
				 g.drawLine(i*num+30, 150-30, i*num+60, 150-30);
			 }else if(str.charAt(i)=='1'){
				 g.drawLine(i*num, 150-30, i*num+30, 150-30);
				 g.drawLine(i*num+30, 150-30, i*num+30, 150+30);
				 g.drawLine(i*num+30, 150+30, i*num+60, 150+30);
			 }
			
		}
		
		
		
	}
	public static void main(String[] args)
	{	
		
		new Test().setVisible(true);
	}
}

