package com.alisa.junit;

public class Calculate {
	private static int result ;//��̬����,�����洢���н��
	//��̬��������̬���� �����ھ�̬����
	//����ʱ��ɼ��أ�������.������ ���ã���̬�������ܵ��÷Ǿ�̬��������֮���ԡ�������this��supper
	static final int a = 1;//�������ܱ���д������ֵ���ܱ��޸�
	public void add(int n) {
		result = result + n ;		
	}
	public void subtract(int n) {
		result = result - 1 ;//bug		
	}
	public void multiply(int n ) {
		result = result * n;
	} 
	public void divide(int n) {
		result = result / n;
	}
	public void square(int n ) {//���跽��ûд��
		//result = n * n;
	}
	public void squareRoot(int n ) {
		for(; ;);//bug
	}
	public void clear() {//���������
		result = 0;
	}
	public int  getResult() {
		return result;
	}
	
	
	

}
