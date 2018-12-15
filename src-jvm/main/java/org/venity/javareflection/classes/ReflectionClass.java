package org.venity.javareflection.classes;

import org.venity.javareflection.JavaReflectionExtension;
import php.runtime.annotation.Reflection;
import php.runtime.env.Environment;
import php.runtime.lang.BaseWrapper;
import php.runtime.reflection.ClassEntity;

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
    public ReflectionMethod getMethod(String method, ReflectionClass... params) throws NoSuchMethodException {
        return new ReflectionMethod(__env__, getWrappedObject().getMethod(method,
                JavaReflectionExtension.reflectToClasses(__env__, params)));
    }

    @Reflection.Signature
    public ReflectionField getField(String name) throws NoSuchFieldException {
        return new ReflectionField(__env__, __wrappedObject.getField(name));
    }
}
