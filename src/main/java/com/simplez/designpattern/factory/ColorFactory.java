package com.simplez.designpattern.factory;

import com.simplez.designpattern.factory.color.Blue;
import com.simplez.designpattern.factory.color.Color;
import com.simplez.designpattern.factory.color.Green;
import com.simplez.designpattern.factory.color.Red;

public class ColorFactory {
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
}
