package com.express.util;

import java.util.Scanner;

//�������빤����
public class InPutUtil {
	//1.�����������
	static Scanner sc=new Scanner(System.in);
	//����String���͵ķ��� 
	public static String getString(){
		//2.����������
		String str=sc.next();
		return str;
	}
	//����int���͵ķ���
	public static int getInt(){
		int i=sc.nextInt();
		return i;
	}
	public static boolean getBoolean(){
		boolean i=sc.nextBoolean();
		return i;
	}
}
