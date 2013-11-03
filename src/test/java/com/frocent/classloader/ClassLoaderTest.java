package com.frocent.classloader;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.Test;

public class ClassLoaderTest {

	@Test
	public void testParent(){
		ClassLoader classLoader  = Thread.currentThread().getContextClassLoader();
		System.out.println(classLoader.getParent());
		System.out.println(classLoader.getParent().getParent());
	}
	
	@Test
	public void testLoaderConstructor() throws ClassNotFoundException, SecurityException, NoSuchMethodException, IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException{
		ClassLoader classLoader  = Thread.currentThread().getContextClassLoader();
		Class<?> clazz = classLoader.loadClass("com.frocent.classloader.Car");
		
		//默认构造器
		Constructor<?> cons = clazz.getDeclaredConstructor((Class[])null);
		Car car = (Car)cons.newInstance();
		
		//通过setter方法设置属性
		Method setBrand = clazz.getMethod("setBrand", String.class);
		setBrand.invoke(car, "红旗");
		Method setColor = clazz.getMethod("setColor", String.class);
		setColor.invoke(car, "红色");
		Method setMaxSpeed = clazz.getMethod("setMaxSpeed", int.class);
		setMaxSpeed.invoke(car, 200);
		car.start();
		
	}
}
