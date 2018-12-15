package org.venity.javareflection.classes;

import org.venity.javareflection.JavaReflectionExtension;
import org.venity.javareflection.classes.abstraction.ReflectionExecutable;
import php.runtime.Memory;
import php.runtime.annotation.Reflection;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;

import java.lang.reflect.Executable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@Reflection.Name("ReflectionMethod")
@Reflection.Namespace(JavaReflectionExtension.NS)
public class ReflectionMethod extends ReflectionExecutable {
    public ReflectionMethod(Environment env, Method wrappedObject) {
        super(env, wrappedObject);
    }

    public ReflectionMethod(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Override
    public Method getWrappedObject() {
        return (Method) super.getWrappedObject();
    }

    @Reflection.Signature
    public void setAccessible(boolean accessible) {
        getWrappedObject().setAccessible(accessible);
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
    public ReflectionClass getReturnType() {
        return new ReflectionClass(__env__, getWrappedObject().getReturnType());
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
    public ReflectionObject invoke(ReflectionObject object, Memory... args)
            throws InvocationTargetException, IllegalAccessException {
        Object[] objs = new Object[args.length];

        for (int i = 0; i < args.length; i++) objs[i] = Memory.unwrap(__env__, args[i]);

        return new ReflectionObject(__env__, getWrappedObject().invoke(object.getWrappedObject(), objs));
    }
}
