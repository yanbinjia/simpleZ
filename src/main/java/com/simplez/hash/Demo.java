package com.simplez.hash;

import java.net.URL;

public class Demo {

	public void test() throws ClassNotFoundException {
		
		
		URL[] urls = sun.misc.Launcher.getBootstrapClassPath().getURLs();

		sun.misc.Version.println();

		for (int i = 0; i < urls.length; i++) {
			System.out.println(urls[i].toExternalForm());
		}
	}

	public void getSysProperty() {
		System.out.println("getSysProperty");
		System.out.println("java_vendor:" + System.getProperty("java.vendor"));
		System.out.println("java_vendor_url:" + System.getProperty("java.vendor.url"));
		System.out.println("java_home:" + System.getProperty("java.home"));
		System.out.println("java_class_version:"
				+ System.getProperty("java.class.version"));
		System.out.println("java_class_path:" + System.getProperty("java.class.path"));
		System.out.println("os_name:" + System.getProperty("os.name"));
		System.out.println("os_arch:" + System.getProperty("os.arch"));
		System.out.println("os_version:" + System.getProperty("os.version"));
		System.out.println("user_name:" + System.getProperty("user.name"));
		System.out.println("user_home:" + System.getProperty("user.home"));
		System.out.println("user_dir:" + System.getProperty("user.dir"));
		System.out.println("java_vm_specification_version:"
				+ System.getProperty("java.vm.specification.version"));
		System.out.println("java_vm_specification_vendor:"
				+ System.getProperty("java.vm.specification.vendor"));
		System.out.println("java_vm_specification_name:"
				+ System.getProperty("java.vm.specification.name"));
		System.out.println("java_vm_version:" + System.getProperty("java.vm.version"));
		System.out.println("java_vm_vendor:" + System.getProperty("java.vm.vendor"));
		System.out.println("java_vm_name:" + System.getProperty("java.vm.name"));
		System.out.println("java_ext_dirs:" + System.getProperty("java.ext.dirs"));
		System.out.println("file_separator:" + System.getProperty("file.separator"));
		System.out.println("path_separator:" + System.getProperty("path.separator"));
		System.out.println("line_separator:" + System.getProperty("line.separator"));
	}

	public static void main(String args[]) throws ClassNotFoundException {
		
		// boolean flag = 10 % 2 == 1 && 10 / 3 == 0 && 1 / 0 == 0;
		// System.out.println(flag ? "mldn" : "yootk");

		Demo demo = new Demo();
		demo.test();

		demo.getSysProperty();
		
		System.out.println(ClassLoader.getSystemClassLoader().loadClass("com.a.c.A.class"));
		

	}
}
