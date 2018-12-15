<?php

namespace java\reflection;


class ReflectionField
{
    /**
     * @return string
     */
    public function getName(): string {}

    /**
     * @return int
     */
    public function getModifiers(): int {}

    /**
     * @return ReflectionClass
     */
    public function getDeclaringClass(): ReflectionClass {}

    /**
     * @param bool $accessible
     */
    public function setAccessible(bool $accessible): void {}

    /**
     * @return ReflectionClass
     */
    public function getType(): ReflectionClass {}

    /**
     * @param ReflectionObject $object
     * @return ReflectionObject
     */
    public function get(ReflectionObject $object): ReflectionObject {}

    /**
     * @param ReflectionObject $object
     * @return bool
     */
    public function getBoolean(ReflectionObject $object): bool {}

    /**
     * @param ReflectionObject $object
     */
    public function getByte(ReflectionObject $object) {}

    /**
     * @param ReflectionObject $object
     */
    public function getChar(ReflectionObject $object) {}

    /**
     * @param ReflectionObject $object
     */
    public function getShort(ReflectionObject $object) {}

    /**
     * @param ReflectionObject $object
     */
    public function getInt(ReflectionObject $object) {}

    /**
     * @param ReflectionObject $object
     */
    public function getLong(ReflectionObject $object) {}

    /**
     * @param ReflectionObject $object
     */
    public function getDouble(ReflectionObject $object) {}

    /**
     * @param ReflectionObject $object
     * @param $value
     */
    public function set(ReflectionObject $object, $value) {}

    /**
     * @param ReflectionObject $object
     * @param bool $value
     */
    public function setBoolean(ReflectionObject $object, bool $value) {}

    /**
     * @param ReflectionObject $object
     * @param $value
     */
    public function setByte(ReflectionObject $object, $value) {}

    /**
     * @param ReflectionObject $object
     * @param $value
     */
    public function setChar(ReflectionObject $object, $value) {}

    /**
     * @param ReflectionObject $object
     * @param $value
     */
    public function setShort(ReflectionObject $object, $value) {}

    /**
     * @param ReflectionObject $object
     * @param $value
     */
    public function setInt(ReflectionObject $object, $value) {}

    /**
     * @param ReflectionObject $object
     * @param $value
     */
    public function setLong(ReflectionObject $object, $value) {}

    /**
     * @param ReflectionObject $object
     * @param $value
     */
    public function setFloat(ReflectionObject $object, $value) {}

    /**
     * @param ReflectionObject $object
     * @param $value
     */
    public function setDouble(ReflectionObject $object, $value) {}
}