<?php


namespace java\reflection;


use php\io\File;

class JarClassLoader
{
    /**
     * @param File $jarFile
     */
    public function __construct(File $jarFile = null) {}

    /**
     * @param File $jar
     */
    public function addJar(File $jar) {}

    /**
     * @param File[] $jars
     */
    public function addJars(array $jars) {}
}