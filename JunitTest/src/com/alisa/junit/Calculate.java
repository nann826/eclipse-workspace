package com.alisa.junit;

public class Calculate {
	private static int result ;//静态变量,用来存储运行结果
	//静态变量、静态方法 都属于静态对象
	//编译时完成加载，用类名.方法名 调用，静态方法不能调用非静态方法，反之可以。不能用this，supper
	static final int a = 1;//方法不能被重写，变量值不能被修改
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
	public void square(int n ) {//假设方法没写好
		//result = n * n;
	}
	public void squareRoot(int n ) {
		for(; ;);//bug
	}
	public void clear() {//将结果清零
		result = 0;
	}
	public int  getResult() {
		return result;
	}
	
	
	

}
