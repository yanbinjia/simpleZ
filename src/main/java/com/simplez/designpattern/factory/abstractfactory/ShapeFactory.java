package com.simplez.designpattern.factory.abstractfactory;

import com.simplez.designpattern.factory.color.Color;
import com.simplez.designpattern.factory.shape.Circle;
import com.simplez.designpattern.factory.shape.Rectangle;
import com.simplez.designpattern.factory.shape.Shape;
import com.simplez.designpattern.factory.shape.Square;

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
