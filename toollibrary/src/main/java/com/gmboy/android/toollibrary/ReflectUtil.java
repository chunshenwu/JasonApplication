
package com.gmboy.android.toollibrary;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


@SuppressWarnings("unchecked")
public class ReflectUtil {

    /**
     *      * 對象方法調用
     *      *
     *      * @param target 調用目標對象
     *      * @param returnType 返回類型
     *      * @param method 方法名稱
     *      * @param parameterTypes 方法參數類型
     *      * @param values 參數
     *      * @return 反射調用返回值
     *      * @throws NoSuchMethodException
     *      * @throws SecurityException
     *      * @throws IllegalAccessException
     *      * @throws IllegalArgumentException
     *      * @throws InvocationTargetException
     *      
     */
    public static <T> T callObjectMethod(Object target, Class<T> returnType, String method, Class<?>[] parameterTypes, Object... values)
        throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Class<? extends Object> clazz = target.getClass();
        Method declaredMethod = clazz.getDeclaredMethod(method, parameterTypes);
        declaredMethod.setAccessible(true);
        return (T) declaredMethod.invoke(target, values);
    }

    public static Object callObjectMethod(Object target, String method, Class<?>[] parameterTypes, Object... values)
        throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Class<? extends Object> clazz = target.getClass();
        Method declaredMethod = clazz.getDeclaredMethod(method, parameterTypes);
        declaredMethod.setAccessible(true);
        return declaredMethod.invoke(target, values);
    }

    public static Object callObjectMethod(Object target, String method, Class<?> clazz, Class<?>[] parameterTypes, Object... values)
        throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Method declaredMethod = clazz.getDeclaredMethod(method, parameterTypes);
        declaredMethod.setAccessible(true);
        return declaredMethod.invoke(target, values);
    }

    /**
     *      * 靜態方法調用
     *      *
     *      * @param clazz
     *      * @param returnType
     *      * @param method
     *      * @param parameterTypes
     *      * @param values
     *      * @return
     *      * @throws NoSuchMethodException
     *      * @throws SecurityException
     *      * @throws IllegalAccessException
     *      * @throws IllegalArgumentException
     *      * @throws InvocationTargetException
     *      
     */
    public static <T> T callStaticObjectMethod(Class<?> clazz, Class<T> returnType, String method, Class<?>[] parameterTypes,
                                               Object... values)
        throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Method declaredMethod = clazz.getDeclaredMethod(method, parameterTypes);
        declaredMethod.setAccessible(true);
        return (T) declaredMethod.invoke(null, values);
    }

    public static Object callStaticObjectMethod(Class<?> clazz, String method, Class<?>[] parameterTypes, Object... values)
        throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Method declaredMethod = clazz.getDeclaredMethod(method, parameterTypes);
        declaredMethod.setAccessible(true);
        return declaredMethod.invoke(null, values);
    }

    /**
     *      * 對象設置值
     *      *
     *      * @param target
     *      * @param field
     *      * @param value
     *      * @throws NoSuchFieldException
     *      * @throws SecurityException
     *      * @throws IllegalArgumentException
     *      * @throws IllegalAccessException
     *      
     */
    public static void setObjectField(Object target, String field, Object value) throws NoSuchFieldException, SecurityException,
        IllegalArgumentException, IllegalAccessException {
        Class<? extends Object> clazz = target.getClass();
        Field declaredField = clazz.getDeclaredField(field);
        declaredField.setAccessible(true);
        declaredField.set(target, value);
    }

    /**
     *      * 對象獲取值
     *      *
     *      * @param target
     *      * @param field
     *      * @return
     *      * @throws NoSuchFieldException
     *      * @throws SecurityException
     *      * @throws IllegalArgumentException
     *      * @throws IllegalAccessException
     *      
     */
    public static Object getObjectField(Object target, String field) throws NoSuchFieldException, SecurityException,
        IllegalArgumentException, IllegalAccessException {
        Class<? extends Object> clazz = target.getClass();
        Field declaredField = clazz.getDeclaredField(field);
        declaredField.setAccessible(true);
        return declaredField.get(target);
    }

    public static <T> T getObjectField(Object target, String field, Class<T> returnType) throws NoSuchFieldException, SecurityException,
        IllegalArgumentException, IllegalAccessException {
        Class<? extends Object> clazz = target.getClass();
        Field declaredField = clazz.getDeclaredField(field);
        declaredField.setAccessible(true);
        return (T) declaredField.get(target);
    }

    /**
     *      * 靜態變量設置值
     *      *
     *      * @param clazz
     *      * @param field
     *      * @param value
     *      * @throws NoSuchFieldException
     *      * @throws SecurityException
     *      * @throws IllegalArgumentException
     *      * @throws IllegalAccessException
     *      
     */
    public static void setStaticObjectField(Class<?> clazz, String field, Object value) throws NoSuchFieldException, SecurityException,
        IllegalArgumentException, IllegalAccessException {
        Field declaredField = clazz.getDeclaredField(field);
        declaredField.setAccessible(true);
        declaredField.set(null, value);
    }

    /**
     *      * 靜態變量獲取值
     *      *
     *      * @param clazz
     *      * @param field
     *      * @return
     *      * @throws NoSuchFieldException
     *      * @throws SecurityException
     *      * @throws IllegalArgumentException
     *      * @throws IllegalAccessException
     *      
     */
    public static Object getStaticObjectField(Class<?> clazz, String field) throws NoSuchFieldException, SecurityException,
        IllegalArgumentException, IllegalAccessException {
        Field declaredField = clazz.getDeclaredField(field);
        declaredField.setAccessible(true);
        return declaredField.get(null);
    }

    public static <T> T getStaticObjectField(Class<?> clazz, String field, Class<T> returnType) throws NoSuchFieldException,
        SecurityException,
        IllegalArgumentException, IllegalAccessException {
        Field declaredField = clazz.getDeclaredField(field);
        declaredField.setAccessible(true);
        return (T) declaredField.get(null);
    }

}