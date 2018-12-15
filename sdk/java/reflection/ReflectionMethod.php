<?php

namespace java\reflection;


class ReflectionMethod extends ReflectionExecutable
{
    /**
     * @param ReflectionObject $object
     * @param array $args
     * @return ReflectionObject
     */
    public function invoke(ReflectionObject $object, array $args): ReflectionObject {}
}