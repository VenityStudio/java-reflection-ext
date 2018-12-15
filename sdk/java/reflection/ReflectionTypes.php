<?php

namespace java\reflection;


class ReflectionTypes
{
    /**
     * @return ReflectionClass
     */
    public function typeInt(): ReflectionClass {}

    /**
     * @return ReflectionClass
     */
    public function typeBool(): ReflectionClass {}

    /**
     * @return ReflectionClass
     */
    public function typeLong(): ReflectionClass {}

    /**
     * @return ReflectionClass
     */
    public function typeDouble(): ReflectionClass {}

    /**
     * @return ReflectionClass
     */
    public function typeFloat(): ReflectionClass {}

    /**
     * @return ReflectionClass
     */
    public function typeByte(): ReflectionClass {}

    /**
     * @return ReflectionClass
     */
    public function typeShort(): ReflectionClass {}

    /**
     * @param $data
     * @return ReflectionObject
     */
    public function toInt($data): ReflectionObject {}

    /**
     * @param $data
     * @return ReflectionObject
     */
    public function toLong($data): ReflectionObject {}

    /**
     * @param $data
     * @return ReflectionObject
     */
    public function toDouble($data): ReflectionObject {}

    /**
     * @param $data
     * @return ReflectionObject
     */
    public function toFloat($data): ReflectionObject {}

    /**
     * @param $data
     * @return ReflectionObject
     */
    public function toByte($data): ReflectionObject {}

    /**
     * @param $data
     * @return ReflectionObject
     */
    public function toShort($data): ReflectionObject {}
}