package com.simplez.designpattern.singleton;

// 饿汉式，线程安全
// 类加载时就初始化，浪费内存。
// 没有加锁，执行效率会提高。
public class UnLazySingleton {
	private static UnLazySingleton instance = new UnLazySingleton();

	// 构造器私有化,防止调用
	private UnLazySingleton() {
	}

	public static UnLazySingleton getInstance() {
		return instance;
	}
}
