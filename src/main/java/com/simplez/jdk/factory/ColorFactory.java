package com.simplez.jdk.factory;

import com.simplez.jdk.factory.color.Blue;
import com.simplez.jdk.factory.color.Color;
import com.simplez.jdk.factory.color.Green;
import com.simplez.jdk.factory.color.Red;

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
