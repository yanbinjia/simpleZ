package com.simplez.jdk.staticproxy.proxy;

import com.simplez.jdk.staticproxy.Subject;

public class StaticProxyClient {

	public static void main(String[] args) {
		Subject sb = SubjectStaticFactory.getInstance();
		sb.doSomething();
		sb.hello("word");
	}

}
