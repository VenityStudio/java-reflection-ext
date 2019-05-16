<?php


namespace java\reflection;


class ReflectionArray
{
    /**
     * @param ReflectionClass $class
     * @param int $length
     * @return ReflectionObject
     */
    public static function newInstance(ReflectionClass $class, int $length): ReflectionObject {}

    /**
     * @param ReflectionObject $object
     * @return int
     */
    public static function getLength(ReflectionObject $object): int {}

    /**
     * @param ReflectionObject $object
     * @param int $id
     * @return ReflectionObject
     */
    public static function get(ReflectionObject $object, int $id): ReflectionObject {}

    /**
     * @param ReflectionObject $object
     * @param int $id
     * @param ReflectionObject $data
     */
    public static function set(ReflectionObject $object, int $id, ReflectionObject $data) {}
}