<?php

namespace java\reflection;


class ReflectionObject
{
    /**
     * @return ReflectionClass
     */
    public function getReflectionClass(): ReflectionClass {}

    /**
     * @param $data
     * @return bool
     */
    public function equals($data): bool {}

    /**
     * Get jPHP data
     */
    public function toMemory() {}

    /**
     * @param $data
     * @return ReflectionObject
     */
    public static function fromMemory($data): ReflectionObject {}

    /**
     * Return ReflectionObject (php.runtime.invoke.Invoker)
     *
     * @param callable $data
     * @return ReflectionObject
     */
    public static function fromCallback(callable $data): ReflectionObject {}
}