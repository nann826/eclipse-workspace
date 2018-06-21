package com.thread;

/**
 * @author alisajin
 * 
 */
public class ThreadDemo {
	
	
	
	public static void main(String[] args) {//main主线程
		
		ThreadA a = new ThreadA();
		//线程启动必须调用Thread类的start()方法 线程A开启后和主线程并行执行
		a.start();
		
		RunnableB runB = new RunnableB();
		//runB.run();//这个是不开辟新线程直接调用run()方法，main()要等run()执行完毕才会继续执行
		//要启动一个新的线程就必须new一个Thread对象出来
		Thread b = new Thread(runB);  //这里使用的是Thread(Runnable target) 这构造方法
		//线程启动必须调用Thread类的start()方法  线程B开启后和线程A和主线程并行执行
		b.start();
		
		for (int i = 1; i <= 10; i++) {
			System.out.println("主线程: " + i);
		}
				
	}
}

//创建线程类方法一： 继承Thread 
class ThreadA extends Thread{

	@Override
	public void run() {
		for (int i = 1 ; i <= 10; i++) {
			System.out.println("Thread A: "+i);			
		}
	}
}

//创建线程类方法二： 实现Runnable接口 ，
class RunnableB implements Runnable{

	@Override
	public void run() {
		for (int i = 1 ; i <= 10; i++) {
			System.out.println("Thread B: "+i);			
		}		
	}
}


