package com.simplez.designpattern.factory.abstractfactory;

import com.simplez.designpattern.factory.color.Color;
import com.simplez.designpattern.factory.shape.Shape;

public abstract class AbstractFactory {
	abstract Color getColor(String color);

	abstract Shape getShape(String shape);
}
