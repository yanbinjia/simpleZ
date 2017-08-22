package com.simplez.jdk.factory.abstractfactory;

import com.simplez.jdk.factory.color.Color;
import com.simplez.jdk.factory.shape.Circle;
import com.simplez.jdk.factory.shape.Rectangle;
import com.simplez.jdk.factory.shape.Shape;
import com.simplez.jdk.factory.shape.Square;

public class ShapeFactory extends AbstractFactory {

	@Override
	Color getColor(String color) {
		return null;
	}

	@Override
	Shape getShape(String shapeType) {
		if (shapeType == null) {
			return null;
		}
		if (shapeType.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
		} else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		} else if (shapeType.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}
		return null;
	}

}
