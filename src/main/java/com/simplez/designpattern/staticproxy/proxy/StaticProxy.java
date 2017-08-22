package com.simplez.designpattern.staticproxy.proxy;

import com.simplez.designpattern.staticproxy.Subject;

public class StaticProxy implements Subject {
	// 代理类持有一个委托类的对象引用
	private Subject delegate;

	public StaticProxy(Subject delegate) {
		this.delegate = delegate;
	}

	@Override
	public void doSomething() {
		// 在真实角色操作之前所附加的操作
		preRequest();
		// 将请求分派给委托类处理
		delegate.doSomething();
		// 在真实角色操作之后所附加的操作
		postRequest();

	}

	@Override
	public void hello(String str) {
		// 在真实角色操作之前所附加的操作
		preRequest();
		// 将请求分派给委托类处理
		delegate.hello(str);
		// 在真实角色操作之后所附加的操作
		postRequest();

	}

	private void preRequest() {
		System.out.println(">>>Pre Request.");
	}

	private void postRequest() {
		System.out.println(">>>Post Request");
	}
}
