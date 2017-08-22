package com.simplez.designpattern.dynamicproxy.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import com.simplez.designpattern.dynamicproxy.RealSubject;
import com.simplez.designpattern.dynamicproxy.Subject;

public class DynamicProxyClient {
	public static void main(String[] args) {
		// 要代理的真实对象
		Subject realSubject = new RealSubject();

		// 要代理哪个真实对象,就将该对象传进去,最后是通过该真实对象来调用其方法的
		InvocationHandler handler = new DynamicProxy(realSubject);

		Subject subject = (Subject) Proxy.newProxyInstance(handler.getClass()
				.getClassLoader(), realSubject.getClass().getInterfaces(), handler);

		System.out.println(subject.getClass().getName());

		subject.doSomething();
		subject.hello("world");

	}
}
