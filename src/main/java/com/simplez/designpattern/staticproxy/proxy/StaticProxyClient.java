package com.simplez.designpattern.staticproxy.proxy;

import com.simplez.designpattern.staticproxy.Subject;

public class StaticProxyClient {

	public static void main(String[] args) {
		Subject sb = SubjectStaticFactory.getInstance();
		sb.doSomething();
		sb.hello("word");
	}

}
