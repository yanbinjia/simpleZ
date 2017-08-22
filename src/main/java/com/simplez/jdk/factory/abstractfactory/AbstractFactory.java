package com.simplez.jdk.factory.abstractfactory;

import com.simplez.jdk.factory.color.Color;
import com.simplez.jdk.factory.shape.Shape;

public abstract class AbstractFactory {
	abstract Color getColor(String color);

	abstract Shape getShape(String shape);
}
