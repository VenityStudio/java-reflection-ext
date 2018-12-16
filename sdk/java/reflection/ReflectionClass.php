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
     * @param ReflectionClass ...$types
     * @return ReflectionConstructor
     */
    public function getDeclaredConstructor(ReflectionClass... $types): ReflectionConstructor {}

    /**
     * @param string $method
     * @param ReflectionClass ...$types
     * @return ReflectionMethod
     */
    public function getMethod(string $method, ReflectionClass... $types): ReflectionMethod {}

    /**
     * @param string $method
     * @param ReflectionClass ...$types
     * @return ReflectionMethod
     */
    public function getDeclaredMethod(string $method, ReflectionClass... $types): ReflectionMethod {}

    /**
     * @param string $name
     * @return ReflectionField
     */
    public function getField(string $name): ReflectionField {}

    /**
     * @param string $name
     * @return ReflectionField
     */
    public function getDeclaredField(string $name): ReflectionField {}

    /**
     * @return ReflectionMethod[]
     */
    public function getMethods(): array {}

    /**
     * @return ReflectionMethod[]
     */
    public function getDeclaredMethods(): array {}

    /**
     * @return ReflectionConstructor[]
     */
    public function getConstructors(): array {}

    /**
     * @return ReflectionConstructor[]
     */
    public function getDeclaredConstructors(): array {}

    /**
     * @return ReflectionField[]
     */
    public function getFields(): array {}

    /**
     * @return ReflectionField[]
     */
    public function getDeclaredFields(): array {}
}