package com.datatype;

import java.util.Random;

public class Datatype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=1;
		long b=88888888L;//必须加L/l
		double c=12.4;
		float d=12.45F;//必须加F/f
		Boolean bool;
		
		//随机数
		Random random= new Random();
		int ran=random.nextInt(10); //java.util.Random;  random[0,n)
		System.out.println(ran);
		Random random2= new Random();
		Integer ran2=random2.nextInt(100);
		Integer ran3=(int) (Math.random()*10);//java.lang.Math 类中的静态方法
		System.out.println(ran3);
		
		//
	}
	

}
