package com.simplez.designpattern.singleton;

/*
 * 枚举 单例实现
 * JDK 版本：JDK1.5 起
 * 描述：这种实现方式还没有被广泛采用，但这是实现单例模式的最佳方法。
 * 它更简洁，自动支持序列化机制，绝对防止多次实例化。
 * 这种方式是 Effective Java 作者 Josh Bloch 提倡的方式，
 * 它不仅能避免多线程同步问题，而且还自动支持序列化机制，防止反序列化重新创建新的对象，绝对防止多次实例化。
 * 不过，由于 JDK1.5 之后才加入 enum 特性，用这种方式写不免让人感觉生疏，在实际工作中，也很少用。
 * 不能通过 reflection attack 来调用私有构造方法。
 */
public enum EnumSingleton {
	INSTANCE;

	// 私有的单例对象
	private Object singletonObj;

	// 私有的 构造方法EnumSingleton,可以用来初始化单例对象
	private EnumSingleton() {
		// 可以将初始化的内容写在构造方法中
		System.out.println("Construct EnumSingleton. Init something.");

		singletonObj = new Object();

		System.out.println("Init singletonObj.");
	}

	// 单例对外暴露的单例使用方法
	public Object doSomething() {
		System.out.println("Call doSomething(). singletonObj -> " + singletonObj);
		return this.singletonObj;
	}
}
