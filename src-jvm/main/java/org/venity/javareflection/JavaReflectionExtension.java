package org.venity.javareflection;

import org.venity.javareflection.classes.*;
import org.venity.javareflection.classes.abstraction.ReflectionExecutable;
import php.runtime.env.CompileScope;
import php.runtime.env.Environment;
import php.runtime.ext.support.Extension;

import java.lang.reflect.Constructor;
import java.lang.reflect.Executable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class JavaReflectionExtension extends Extension {
    public static final String NS = "java\\reflection";
    
    @Override
    public Status getStatus() {
        return Status.EXPERIMENTAL;
    }

    @Override
    public String getName() {
        return "Java Reflection API";
    }

    @Override
    public void onRegister(CompileScope scope) {
        registerWrapperClass(scope, Class.class, ReflectionClass.class);
        registerWrapperClass(scope, Object.class, ReflectionObject.class);
        registerWrapperClass(scope, Executable.class, ReflectionExecutable.class);
        registerWrapperClass(scope, Constructor.class, ReflectionConstructor.class);
        registerWrapperClass(scope, Method.class, ReflectionMethod.class);
        registerWrapperClass(scope, Field.class, ReflectionField.class);

        registerClass(scope, ReflectionTypes.class);
    }

    public static ReflectionClass[] classesToReflect(Environment environment, Class[] classes) {
        ReflectionClass[] reflectionClasses = new ReflectionClass[classes.length];

        for (int i = 0; i < classes.length; i++) reflectionClasses[i] = new ReflectionClass(environment, classes[i]);
        return reflectionClasses;
    }

    public static Class[] reflectToClasses(Environment environment, ReflectionClass[] classes) {
        Class[] reflectionClasses = new Class[classes.length];

        for (int i = 0; i < classes.length; i++) reflectionClasses[i] = classes[i].getWrappedObject();
        return reflectionClasses;
    }
}