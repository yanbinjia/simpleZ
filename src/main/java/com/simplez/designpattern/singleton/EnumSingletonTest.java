package com.simplez.designpattern.singleton;

public class EnumSingletonTest {

	public static void main(String[] args) {
		
		// 单例调用
		EnumSingleton.INSTANCE.doSomething();
		
		EnumSingleton.INSTANCE.doSomething();
		
		EnumSingleton.INSTANCE.doSomething();

	}

}
