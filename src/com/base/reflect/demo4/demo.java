package com.base.reflect.demo4;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


/**
 * 反射获取运行时类的信息  https://www.cnblogs.com/luoxn28/p/5686794.html
 * @author Administrator
 *
 */
public class demo {

	
	public static void main(String[] args) throws IntrospectionException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Person person = new Person("ywc","26");

		Class class1 = person.getClass();
		
//		Field[] fields = class1.getFields();
		Field[] fields = class1.getDeclaredFields();
		for (Field field : fields) {
			String key = field.getName();
	        System.out.println(key);
			PropertyDescriptor desp = new PropertyDescriptor(key, class1);
			Method method = desp.getReadMethod();
	        Object value = method.invoke(person);
	        System.out.println(key + ":" + value);

		}
	}
}
