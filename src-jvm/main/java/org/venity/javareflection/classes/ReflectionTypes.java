package org.venity.javareflection.classes;

import org.venity.javareflection.JavaReflectionExtension;
import php.runtime.annotation.Reflection;
import php.runtime.env.Environment;
import php.runtime.lang.BaseObject;
import php.runtime.reflection.ClassEntity;

@Reflection.Name("ReflectionTypes")
@Reflection.Namespace(JavaReflectionExtension.NS)
public class ReflectionTypes extends BaseObject {
    public ReflectionTypes(Environment env) {
        super(env);
    }

    protected ReflectionTypes(ClassEntity entity) {
        super(entity);
    }

    public ReflectionTypes(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Reflection.Signature
    public static ReflectionClass typeInt(Environment environment) {
        return new ReflectionClass(environment, int.class);
    }

    @Reflection.Signature
    public static ReflectionClass typeBool(Environment environment) {
        return new ReflectionClass(environment, boolean.class);
    }

    @Reflection.Signature
    public static ReflectionClass typeLong(Environment environment) {
        return new ReflectionClass(environment, long.class);
    }

    @Reflection.Signature
    public static ReflectionClass typeDouble(Environment environment) {
        return new ReflectionClass(environment, double.class);
    }

    @Reflection.Signature
    public static ReflectionClass typeFloat(Environment environment) {
        return new ReflectionClass(environment, float.class);
    }

    @Reflection.Signature
    public static ReflectionClass typeByte(Environment environment) {
        return new ReflectionClass(environment, byte.class);
    }

    @Reflection.Signature
    public static ReflectionClass typeShort(Environment environment) {
        return new ReflectionClass(environment, short.class);
    }

    @Reflection.Signature
    public static ReflectionObject toInt(Environment environment, int num) {
        return new ReflectionObject(environment, num);
    }

    @Reflection.Signature
    public static ReflectionObject toLong(Environment environment, long num) {
        return new ReflectionObject(environment, num);
    }

    @Reflection.Signature
    public static ReflectionObject toDouble(Environment environment, double num) {
        return new ReflectionObject(environment, num);
    }

    @Reflection.Signature
    public static ReflectionObject toFloat(Environment environment, float num) {
        return new ReflectionObject(environment, num);
    }

    @Reflection.Signature
    public static ReflectionObject toByte(Environment environment, byte data) {
        return new ReflectionObject(environment, data);
    }

    @Reflection.Signature
    public static ReflectionObject toShort(Environment environment, short data) {
        return new ReflectionObject(environment, data);
    }
}
