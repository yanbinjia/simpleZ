package com.simplez.jdk.factory;

import com.simplez.jdk.factory.color.Color;
import com.simplez.jdk.factory.shape.Shape;

public class FactoryPatternDemo {
	public static void main(String[] args) {

		// ShapeFactory demo
		ShapeFactory shapeFactory = new ShapeFactory();

		// 获取 Circle 的对象，并调用它的 draw 方法
		Shape shape1 = shapeFactory.getShape("CIRCLE");
		shape1.draw();

		// 获取 Rectangle 的对象，并调用它的 draw 方法
		Shape shape2 = shapeFactory.getShape("RECTANGLE");
		shape2.draw();

		// 获取 Square 的对象，并调用它的 draw 方法
		Shape shape3 = shapeFactory.getShape("SQUARE");
		shape3.draw();

		// ColorFactory demo
		ColorFactory colorFactory = new ColorFactory();
		Color color1 = colorFactory.getColor("RED");
		color1.fill();

		Color color2 = colorFactory.getColor("GREEN");
		color2.fill();
	}
}
