package org.venity.javareflection.classes;

import org.venity.javareflection.JavaReflectionExtension;
import php.runtime.Memory;
import php.runtime.annotation.Reflection;
import php.runtime.env.Environment;
import php.runtime.lang.BaseWrapper;
import php.runtime.reflection.ClassEntity;

import java.lang.reflect.Field;

@Reflection.Name("ReflectionField")
@Reflection.Namespace(JavaReflectionExtension.NS)
public class ReflectionField extends BaseWrapper<Field> {
    public ReflectionField(Environment env, Field wrappedObject) {
        super(env, wrappedObject);
    }

    public ReflectionField(Environment env, ClassEntity clazz) {
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
    public void setAccessible(boolean accessible) {
        __wrappedObject.setAccessible(accessible);
    }

    @Reflection.Signature
    public ReflectionClass getType() {
        return new ReflectionClass(__env__, __wrappedObject.getType());
    }

    @Reflection.Signature
    public ReflectionObject get(ReflectionObject object) throws IllegalAccessException {
        return new ReflectionObject(__env__, __wrappedObject.get(object.getWrappedObject()));
    }

    @Reflection.Signature
    public boolean getBoolean(ReflectionObject object) throws IllegalAccessException {
        return __wrappedObject.getBoolean(object.getWrappedObject());
    }

    @Reflection.Signature
    public byte getByte(ReflectionObject object) throws IllegalAccessException {
        return __wrappedObject.getByte(object.getWrappedObject());
    }

    @Reflection.Signature
    public char getChar(ReflectionObject object) throws IllegalAccessException {
        return __wrappedObject.getChar(object.getWrappedObject());
    }

    @Reflection.Signature
    public short getShort(ReflectionObject object) throws IllegalAccessException {
        return __wrappedObject.getShort(object.getWrappedObject());
    }

    @Reflection.Signature
    public int getInt(ReflectionObject object) throws IllegalAccessException {
        return __wrappedObject.getInt(object.getWrappedObject());
    }

    @Reflection.Signature
    public long getLong(ReflectionObject object) throws IllegalAccessException {
        return __wrappedObject.getLong(object.getWrappedObject());
    }

    @Reflection.Signature
    public float getFloat(ReflectionObject object) throws IllegalAccessException {
        return __wrappedObject.getFloat(object.getWrappedObject());
    }

    @Reflection.Signature
    public double getDouble(ReflectionObject object) throws IllegalAccessException {
        return __wrappedObject.getDouble(object.getWrappedObject());
    }

    @Reflection.Signature
    public void set(ReflectionObject object, Memory value) throws IllegalAccessException {
        __wrappedObject.set(object.getWrappedObject(), Memory.unwrap(__env__, value));
    }

    @Reflection.Signature
    public void setBoolean(ReflectionObject object, boolean value) throws IllegalAccessException {
        __wrappedObject.set(object.getWrappedObject(), value);
    }

    @Reflection.Signature
    public void setByte(ReflectionObject object, byte value) throws IllegalAccessException {
        __wrappedObject.set(object.getWrappedObject(), value);
    }

    @Reflection.Signature
    public void setChar(ReflectionObject object, char value) throws IllegalAccessException {
        __wrappedObject.set(object.getWrappedObject(), value);
    }

    @Reflection.Signature
    public void setShort(ReflectionObject object, short value) throws IllegalAccessException {
        __wrappedObject.set(object.getWrappedObject(), value);
    }

    @Reflection.Signature
    public void setInt(ReflectionObject object, int value) throws IllegalAccessException {
        __wrappedObject.set(object.getWrappedObject(), value);
    }

    @Reflection.Signature
    public void setLong(ReflectionObject object, long value) throws IllegalAccessException {
        __wrappedObject.set(object.getWrappedObject(), value);
    }

    @Reflection.Signature
    public void setFloat(ReflectionObject object, float value) throws IllegalAccessException {
        __wrappedObject.set(object.getWrappedObject(), value);
    }

    @Reflection.Signature
    public void setDouble(ReflectionObject object, double value) throws IllegalAccessException {
        __wrappedObject.set(object.getWrappedObject(), value);
    }
}
