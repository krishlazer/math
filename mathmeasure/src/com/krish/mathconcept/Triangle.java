package com.krish.mathconcept;

public class Triangle implements ShapeMeasures 
{

	@Override
	public String shapeVolume() 
	{
		
		return "Volume of triangle is zero";
	}

	@Override
	public String shapeArea() 
	{
		
		return "Area of triangle is half the base multiplied by the altitude.";
	}

}
