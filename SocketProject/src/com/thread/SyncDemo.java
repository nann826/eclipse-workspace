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
	
	public /*synchronized*/ void  add(String name ) { //在声明方法时加入synchronized时表示在执行这个方法的过程之中当前对象被锁定
		
		synchronized (this){
		//使用synchronized(this) 来锁定当前对象。这样就不会出现不同线程访问同一个对象资源的问题了。
	    //只有当一个线程访问结束后 另外一个线程才能访问	
			
			num++;
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println( name+ "你是第"+ num +"个使用Timer的线程");
			
			
		}
		
	}
	
	
}