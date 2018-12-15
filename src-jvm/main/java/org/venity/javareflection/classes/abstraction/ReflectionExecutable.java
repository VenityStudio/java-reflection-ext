package org.venity.javareflection.classes.abstraction;

import org.venity.javareflection.JavaReflectionExtension;
import org.venity.javareflection.classes.ReflectionClass;
import php.runtime.annotation.Reflection;
import php.runtime.env.Environment;
import php.runtime.lang.BaseWrapper;
import php.runtime.reflection.ClassEntity;

import java.lang.reflect.Executable;

@Reflection.Abstract
@Reflection.Name("ReflectionExecutable")
@Reflection.Namespace(JavaReflectionExtension.NS)
abstract public class ReflectionExecutable extends BaseWrapper<Executable> {
    public ReflectionExecutable(Environment env, Executable wrappedObject) {
        super(env, wrappedObject);
    }

    public ReflectionExecutable(Environment env, ClassEntity clazz) {
        super(env, clazz);
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
    public ReflectionClass getDeclaringClass(Environment environment) {
        return new ReflectionClass(environment, __wrappedObject.getDeclaringClass());
    }

    @Reflection.Signature
    public ReflectionClass[] getParameterTypes() {
        return JavaReflectionExtension.classesToReflect(__env__, __wrappedObject.getParameterTypes());
    }

    @Reflection.Signature
    public ReflectionClass[] getExceptionTypes() {
        return JavaReflectionExtension.classesToReflect(__env__, __wrappedObject.getExceptionTypes());
    }

    @Reflection.Signature
    public int getParameterCount() {
        return __wrappedObject.getParameterCount();
    }


    @Reflection.Signature
    public void setAccessible(boolean accessible) {
        __wrappedObject.setAccessible(accessible);
    }
}