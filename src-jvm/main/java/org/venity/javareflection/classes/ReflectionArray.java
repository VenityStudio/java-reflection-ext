package org.venity.javareflection.classes;

import org.venity.javareflection.JavaReflectionExtension;
import php.runtime.annotation.Reflection;
import php.runtime.env.Environment;
import php.runtime.lang.BaseWrapper;
import php.runtime.reflection.ClassEntity;

import java.lang.reflect.Array;

@Reflection.Name("ReflectionArray")
@Reflection.Namespace(JavaReflectionExtension.NS)
public class ReflectionArray extends BaseWrapper<Array> {
    public ReflectionArray(Environment env, Array wrappedObject) {
        super(env, wrappedObject);
    }

    public ReflectionArray(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Reflection.Signature
    public static ReflectionObject newInstance(Environment environment, Class<?> componentType, int length) {
        return new ReflectionObject(environment, Array.newInstance(componentType, length));
    }

    @Reflection.Signature
    public static int getLength(ReflectionObject object) {
        return Array.getLength(object.getWrappedObject());
    }

    @Reflection.Signature
    public static ReflectionObject get(Environment environment, ReflectionObject object, int id) {
        return new ReflectionObject(environment, Array.get(object.getWrappedObject(), id));
    }

    @Reflection.Signature
    public static void set(Environment environment, ReflectionObject object, int id, ReflectionObject reflectionObject) {
        Array.set(object.getWrappedObject(), id, reflectionObject.getWrappedObject());
    }
}
