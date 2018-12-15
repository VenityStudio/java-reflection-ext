<?php

namespace java\reflection;


class ReflectionClass
{
    private function __construct() {}

    /**
     * @param string $javaClassName
     * @return ReflectionClass
     */
    public static function forName(string $javaClassName): ReflectionClass {}

    public function newInstance(): ReflectionObject {}

    /**
     * @param ReflectionClass[] $types
     * @return ReflectionConstructor
     */
    public function getConstructor(ReflectionClass... $types): ReflectionConstructor {}

    /**
     * @param string $method
     * @param ReflectionClass ...$types
     * @return ReflectionMethod
     */
    public function getMethod(string $method, ReflectionClass... $types): ReflectionMethod {}

    /**
     * @param string $name
     * @return ReflectionField
     */
    public function getField(string $name): ReflectionField {}
}