package com.krish.mathconcept;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ExecuteClass 
{

	public static void main(String[] args) 
	{
		
		ApplicationContext apc = new ClassPathXmlApplicationContext("appContext.xml");
		
		ShapeMeasures sm1 = apc.getBean("tri", Triangle.class);
		
		BoxContainer bc1 = apc.getBean("box", BoxContainer.class);
		
		Cube cb1 = apc.getBean("cub", Cube.class);
		
		sm1.shapeVolume();
		
		
		
		
		
	
		
	}

}
