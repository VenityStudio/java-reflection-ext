package org.venity.javareflection.classes;

import org.venity.javareflection.JavaReflectionExtension;
import php.runtime.annotation.Reflection;
import php.runtime.env.Environment;
import php.runtime.lang.BaseObject;
import php.runtime.reflection.ClassEntity;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

@Reflection.Name("JarClassLoader")
@Reflection.Namespace(JavaReflectionExtension.NS)
public class JarClassLoader extends BaseObject {

    public JarClassLoader(Environment env) {
        super(env);
    }

    protected JarClassLoader(ClassEntity entity) {
        super(entity);
    }

    public JarClassLoader(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    private URLClassLoader classLoader;

    @Reflection.Signature
    public void __construct(File jar) throws MalformedURLException {
        classLoader = new URLClassLoader(
                new URL[] {jar.toURI().toURL()},
                this.getClass().getClassLoader()
        );
    }

    @Reflection.Signature
    public void __construct() throws MalformedURLException {
        classLoader = new URLClassLoader(
                new URL[0],
                this.getClass().getClassLoader()
        );
    }

    @Reflection.Signature
    public void addJar(File jar)
            throws MalformedURLException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method addURL = classLoader
                .getClass()
                .getDeclaredMethod("addURL", URL.class);
        addURL.setAccessible(true);
        addURL.invoke(classLoader, jar);
    }

    @Reflection.Signature
    public void addJars(File[] jars)
            throws InvocationTargetException, MalformedURLException, IllegalAccessException, NoSuchMethodException {
        for (File jar: jars)
            addJar(jar);
    }


    public URLClassLoader getClassLoader() {
        return classLoader;
    }
}
