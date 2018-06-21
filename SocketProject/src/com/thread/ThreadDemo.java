package com.thread;

/**
 * @author alisajin
 * 
 */
public class ThreadDemo {
	
	
	
	public static void main(String[] args) {//main���߳�
		
		ThreadA a = new ThreadA();
		//�߳������������Thread���start()���� �߳�A����������̲߳���ִ��
		a.start();
		
		RunnableB runB = new RunnableB();
		//runB.run();//����ǲ��������߳�ֱ�ӵ���run()������main()Ҫ��run()ִ����ϲŻ����ִ��
		//Ҫ����һ���µ��߳̾ͱ���newһ��Thread�������
		Thread b = new Thread(runB);  //����ʹ�õ���Thread(Runnable target) �⹹�췽��
		//�߳������������Thread���start()����  �߳�B��������߳�A�����̲߳���ִ��
		b.start();
		
		for (int i = 1; i <= 10; i++) {
			System.out.println("���߳�: " + i);
		}
				
	}
}

//�����߳��෽��һ�� �̳�Thread 
class ThreadA extends Thread{

	@Override
	public void run() {
		for (int i = 1 ; i <= 10; i++) {
			System.out.println("Thread A: "+i);			
		}
	}
}

//�����߳��෽������ ʵ��Runnable�ӿ� ��
class RunnableB implements Runnable{

	@Override
	public void run() {
		for (int i = 1 ; i <= 10; i++) {
			System.out.println("Thread B: "+i);			
		}		
	}
}


