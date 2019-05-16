package org.venity.javareflection.classes;

import org.venity.javareflection.JavaReflectionExtension;
import php.runtime.annotation.Reflection;
import php.runtime.env.Environment;
import php.runtime.lang.BaseObject;
import php.runtime.reflection.ClassEntity;

import java.io.File;
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

    public URLClassLoader getClassLoader() {
        return classLoader;
    }
}
