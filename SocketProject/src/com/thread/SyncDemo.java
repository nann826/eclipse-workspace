package com.thread;

public class SyncDemo implements Runnable{
	
	Timer timer = new Timer();
	
	public static void main(String[] args) {
		SyncDemo demo = new SyncDemo();
		Thread t1 = new Thread(demo);
		Thread t2 = new Thread(demo);
		t1.setName("t1");
		t2.setName("t2");
		t1.start();
		t2.start();
	
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		timer.add(Thread.currentThread().getName());
	}
	
}

class Timer{
	
	private static int num = 0;
	
	public /*synchronized*/ void  add(String name ) { //����������ʱ����synchronizedʱ��ʾ��ִ����������Ĺ���֮�е�ǰ��������
		
		synchronized (this){
		//ʹ��synchronized(this) ��������ǰ���������Ͳ�����ֲ�ͬ�̷߳���ͬһ��������Դ�������ˡ�
	    //ֻ�е�һ���̷߳��ʽ����� ����һ���̲߳��ܷ���	
			
			num++;
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println( name+ "���ǵ�"+ num +"��ʹ��Timer���߳�");
			
			
		}
		
	}
	
	
}