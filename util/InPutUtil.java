package com.express.util;

import java.util.Scanner;

//键盘输入工具类
public class InPutUtil {
	//1.键盘输入对象
	static Scanner sc=new Scanner(System.in);
	//接收String类型的方法 
	public static String getString(){
		//2.接收输入结果
		String str=sc.next();
		return str;
	}
	//接收int类型的方法
	public static int getInt(){
		int i=sc.nextInt();
		return i;
	}
	public static boolean getBoolean(){
		boolean i=sc.nextBoolean();
		return i;
	}
}
