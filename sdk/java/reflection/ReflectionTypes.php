<?php

namespace java\reflection;


class ReflectionTypes
{
    /**
     * @return ReflectionClass
     */
    public static function typeInt(): ReflectionClass {}

    /**
     * @return ReflectionClass
     */
    public static function typeBool(): ReflectionClass {}

    /**
     * @return ReflectionClass
     */
    public static function typeLong(): ReflectionClass {}

    /**
     * @return ReflectionClass
     */
    public static function typeDouble(): ReflectionClass {}

    /**
     * @return ReflectionClass
     */
    public static function typeFloat(): ReflectionClass {}

    /**
     * @return ReflectionClass
     */
    public static function typeByte(): ReflectionClass {}

    /**
     * @return ReflectionClass
     */
    public static function typeShort(): ReflectionClass {}

    /**
     * @param $data
     * @return ReflectionObject
     */
    public static function toInt($data): ReflectionObject {}

    /**
     * @param $data
     * @return ReflectionObject
     */
    public static function toLong($data): ReflectionObject {}

    /**
     * @param $data
     * @return ReflectionObject
     */
    public static function toDouble($data): ReflectionObject {}

    /**
     * @param $data
     * @return ReflectionObject
     */
    public static function toFloat($data): ReflectionObject {}

    /**
     * @param $data
     * @return ReflectionObject
     */
    public static function toByte($data): ReflectionObject {}

    /**
     * @param $data
     * @return ReflectionObject
     */
    public static function toShort($data): ReflectionObject {}

    /**
     * Null for java
     * @return ReflectionObject
     */
    public static function getNull(): ReflectionObject {}
}