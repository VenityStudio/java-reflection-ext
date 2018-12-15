<?php

namespace java\reflection;

abstract class ReflectionExecutable
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
     * @return array ReflectionClass[]
     */
    public function getParameterTypes(): array {}

    /**
     * @return array ReflectionClass[]
     */
    public function getExceptionTypes(): array {}

    /**
     * @return int
     */
    public function getParameterCount(): int {}

    /**
     * @param bool $accessible
     */
    public function setAccessible(bool $accessible): void {}
}