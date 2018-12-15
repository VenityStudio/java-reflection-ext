package org.venity.javareflection.classes;

import org.venity.javareflection.JavaReflectionExtension;
import org.venity.javareflection.classes.abstraction.ReflectionExecutable;
import php.runtime.Memory;
import php.runtime.annotation.Reflection;
import php.runtime.env.Environment;
import php.runtime.lang.BaseWrapper;
import php.runtime.reflection.ClassEntity;

import java.lang.reflect.Constructor;
import java.lang.reflect.Executable;
import java.lang.reflect.InvocationTargetException;

@Reflection.Name("ReflectionConstructor")
@Reflection.Namespace(JavaReflectionExtension.NS)
public class ReflectionConstructor extends ReflectionExecutable {
    public ReflectionConstructor(Environment env, Constructor wrappedObject) {
        super(env, wrappedObject);
    }

    public ReflectionConstructor(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Reflection.Signature
    public void setAccessible(boolean accessible) {
        getWrappedObject().setAccessible(accessible);
    }

    @Override
    public Constructor getWrappedObject() {
        return (Constructor) super.getWrappedObject();
    }

    @Reflection.Signature
    public ReflectionClass getDeclaringClass() {
        return new ReflectionClass(__env__, getWrappedObject().getDeclaringClass());
    }

    @Reflection.Signature
    public String getName() {
        return __wrappedObject.getName();
    }

    @Reflection.Signature
    public int getModifiers() {
        return __wrappedObject.getModifiers();
    }

    @Reflection.Signature
    public ReflectionClass[] getParameterTypes() {
        return JavaReflectionExtension.classesToReflect(__env__, getWrappedObject().getParameterTypes());
    }

    @Reflection.Signature
    public int getParameterCount() {
        return __wrappedObject.getParameterCount();
    }

    @Reflection.Signature
    public ReflectionClass[] getExceptionTypes() {
        return JavaReflectionExtension.classesToReflect(__env__, getWrappedObject().getExceptionTypes());
    }

    @Reflection.Signature
    public ReflectionObject newInstance(Memory... args)
            throws IllegalAccessException, InvocationTargetException, InstantiationException {
        Object[] objs = new Object[args.length];

        for (int i = 0; i < args.length; i++) objs[i] = Memory.unwrap(__env__, args[i]);

        return new ReflectionObject(__env__, getWrappedObject().newInstance(objs));
    }
}