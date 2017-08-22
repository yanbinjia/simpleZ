package com.simplez.jdk.staticproxy;

public class RealSubject implements Subject {

	@Override
	public void doSomething() {
		System.out.println("doSomething");

	}

	@Override
	public void hello(String str) {
		System.out.println("hello: " + str);

	}

}
