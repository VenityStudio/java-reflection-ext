package org.venity.javareflection.classes;

import org.venity.javareflection.JavaReflectionExtension;
import php.runtime.annotation.Reflection;
import php.runtime.env.Environment;
import php.runtime.lang.BaseWrapper;
import php.runtime.reflection.ClassEntity;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

@Reflection.Name("ReflectionClass")
@Reflection.Namespace(JavaReflectionExtension.NS)
public class ReflectionClass extends BaseWrapper<Class> {

    public ReflectionClass(Environment env, Class wrappedObject) {
        super(env, wrappedObject);
    }

    public ReflectionClass(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Override
    public Class getWrappedObject() {
        return __wrappedObject;
    }

    @Reflection.Signature
    public static ReflectionClass forName(Environment env, String className) throws ClassNotFoundException {
        return new ReflectionClass(env, Class.forName(className));
    }

    @Reflection.Signature
    public ReflectionObject newInstance() throws IllegalAccessException, InstantiationException {
        return new ReflectionObject(__env__, __wrappedObject.newInstance());
    }

    @Reflection.Signature
    public ReflectionConstructor getConstructor(ReflectionClass[] classes) throws NoSuchMethodException {
        return new ReflectionConstructor(__env__,
                __wrappedObject.getConstructor(JavaReflectionExtension.reflectToClasses(__env__, classes)));
    }

    @Reflection.Signature
    public ReflectionConstructor[] getConstructors() {
        Constructor[] constructors = getWrappedObject().getConstructors();
        ReflectionConstructor[] reflectionConstructors = new ReflectionConstructor[constructors.length];

        for (int i = 0; i < constructors.length; i++)
            reflectionConstructors[i] = new ReflectionConstructor(__env__, constructors[i]);

        return reflectionConstructors;
    }

    @Reflection.Signature
    public ReflectionConstructor[] getDeclaredConstructors() {
        Constructor[] constructors = getWrappedObject().getDeclaredConstructors();
        ReflectionConstructor[] reflectionConstructors = new ReflectionConstructor[constructors.length];

        for (int i = 0; i < constructors.length; i++)
            reflectionConstructors[i] = new ReflectionConstructor(__env__, constructors[i]);

        return reflectionConstructors;
    }

    @Reflection.Signature
    public ReflectionConstructor getDeclaredConstructor(ReflectionClass[] classes) throws NoSuchMethodException {
        return new ReflectionConstructor(__env__,
                __wrappedObject.getDeclaredConstructor(JavaReflectionExtension.reflectToClasses(__env__, classes)));
    }

    @Reflection.Signature
    public ReflectionMethod getMethod(String method, ReflectionClass... params) throws NoSuchMethodException {
        return new ReflectionMethod(__env__, getWrappedObject().getMethod(method,
                JavaReflectionExtension.reflectToClasses(__env__, params)));
    }

    @Reflection.Signature
    public ReflectionMethod[] getMethods() {
        Method[] methods = getWrappedObject().getMethods();
        ReflectionMethod[] reflectionMethods = new ReflectionMethod[methods.length];

        for (int i = 0; i < methods.length; i++)
            reflectionMethods[i] = new ReflectionMethod(__env__, methods[i]);

        return reflectionMethods;
    }

    @Reflection.Signature
    public ReflectionMethod[] getDeclaredMethods() {
        Method[] methods = getWrappedObject().getDeclaredMethods();
        ReflectionMethod[] reflectionMethods = new ReflectionMethod[methods.length];

        for (int i = 0; i < methods.length; i++)
            reflectionMethods[i] = new ReflectionMethod(__env__, methods[i]);

        return reflectionMethods;
    }

    @Reflection.Signature
    public ReflectionMethod getDeclaredMethod(String method, ReflectionClass... params) throws NoSuchMethodException {
        return new ReflectionMethod(__env__, getWrappedObject().getDeclaredMethod(method,
                JavaReflectionExtension.reflectToClasses(__env__, params)));
    }

    @Reflection.Signature
    public ReflectionField getField(String name) throws NoSuchFieldException {
        return new ReflectionField(__env__, __wrappedObject.getField(name));
    }

    @Reflection.Signature
    public ReflectionField[] getFields() {
        Field[] fields = getWrappedObject().getFields();
        ReflectionField[] reflectionFields = new ReflectionField[fields.length];

        for (int i = 0; i < fields.length; i++)
            reflectionFields[i] = new ReflectionField(__env__, fields[i]);

        return reflectionFields;
    }

    @Reflection.Signature
    public ReflectionField[] getDeclaredFields() {
        Field[] fields = getWrappedObject().getDeclaredFields();
        ReflectionField[] reflectionFields = new ReflectionField[fields.length];

        for (int i = 0; i < fields.length; i++)
            reflectionFields[i] = new ReflectionField(__env__, fields[i]);

        return reflectionFields;
    }

    @Reflection.Signature
    public ReflectionField getDeclaredField(String name) throws NoSuchFieldException {
        return new ReflectionField(__env__, __wrappedObject.getDeclaredField(name));
    }

    @Reflection.Signature
    public String getName() {
        return getWrappedObject().getName();
    }

    @Reflection.Signature
    public String getCanonicalName() {
        return getWrappedObject().getCanonicalName();
    }
}