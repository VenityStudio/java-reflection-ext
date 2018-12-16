package org.venity.javareflection.classes;

import org.venity.javareflection.JavaReflectionExtension;
import php.runtime.Memory;
import php.runtime.annotation.Reflection;
import php.runtime.env.Environment;
import php.runtime.lang.BaseWrapper;
import php.runtime.reflection.ClassEntity;

@Reflection.Name("ReflectionObject")
@Reflection.Namespace(JavaReflectionExtension.NS)
public class ReflectionObject extends BaseWrapper<Object> {

    public ReflectionObject(Environment env, Object wrappedObject) {
        super(env, wrappedObject);
    }

    public ReflectionObject(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Override
    public Object getWrappedObject() {
        return __wrappedObject;
    }

    @Reflection.Signature
    public ReflectionClass getReflectionClass() {
        return new ReflectionClass(__env__, __wrappedObject.getClass());
    }

    @Override
    public boolean __equal(BaseWrapper iObject) {
        return __wrappedObject.equals(iObject.getWrappedObject());
    }

    @Reflection.Signature
    public boolean equals(Memory memory) {
        return __wrappedObject.equals(Memory.unwrap(__env__, memory));
    }

    @Reflection.Signature
    public Memory toMemory() {
        return Memory.wrap(__env__, this.getWrappedObject());
    }

    @Reflection.Signature
    public static ReflectionObject fromMemory(Environment environment, Memory memory) {
        return new ReflectionObject(environment, Memory.unwrap(environment, memory));
    }
}
