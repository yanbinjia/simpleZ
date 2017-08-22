package com.simplez.designpattern.factory.abstractfactory;

import com.simplez.designpattern.factory.color.Blue;
import com.simplez.designpattern.factory.color.Color;
import com.simplez.designpattern.factory.color.Green;
import com.simplez.designpattern.factory.color.Red;
import com.simplez.designpattern.factory.shape.Shape;

public class ColorFactory extends AbstractFactory {

	@Override
	Color getColor(String color) {
		if (color == null) {
			return null;
		}
		if (color.equalsIgnoreCase("RED")) {
			return new Red();
		} else if (color.equalsIgnoreCase("GREEN")) {
			return new Green();
		} else if (color.equalsIgnoreCase("BLUE")) {
			return new Blue();
		}
		return null;
	}

	@Override
	Shape getShape(String shape) {
		return null;
	}

}
