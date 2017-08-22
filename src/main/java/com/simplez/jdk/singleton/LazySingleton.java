package com.simplez.jdk.singleton;

// 懒汉式，线程安全
// 第一次调用才初始化，避免内存浪费
// 必须加锁 synchronized 才能保证单例，但加锁会影响效率。
public class LazySingleton {
	private static LazySingleton instance;

	// 构造器私有化,防止调用
	private LazySingleton() {
	}

	public static synchronized LazySingleton getInstance() {
		if (instance == null) {
			instance = new LazySingleton();
		}
		return instance;
	}
}
