package _7_Reflection_App.beans;

import java.lang.reflect.Field;

public class Demo {

	public static void main(String[] args) {
		try {
			Class<?> clzz = Class.forName("_7_Reflection_App.beans.User");
			Object object=clzz.newInstance();
			Field agefield=clzz.getDeclaredField("age");
			agefield.setAccessible(false);
			agefield.set(object,20);
			System.out.println(agefield.get(object));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
