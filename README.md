# Java Bridge for jPHP

[![Venity project status](https://img.shields.io/badge/Venity-official-blue.svg)](https://vk.com/venity)
[![Build Status](https://travis-ci.org/VenityStudio/java-reflection-ext.svg?branch=master)](https://travis-ci.org/VenityStudio/java-reflection-ext)

## How to build ?

Use ``jppm publish --yes`` command to build and publish to local repository

## API Documentation

 * [Русский](api-docs/README.ru.md)
 * [English](api-docs/README.md)

## Example

Building **Swing** form:
```php
use java\reflection\ReflectionClass;
use java\reflection\ReflectionTypes; // import classes

$frame_class = ReflectionClass::forName("javax.swing.JFrame"); // get ReflectionClass for javax.swing.JFrame
$frame = $frame_class->getConstructor([ ReflectionClass::forName("java.lang.String") ])->newInstance([ "Test!" ]); // get new java class instance from construcor
// getting setDefaultCloseOperation method & invoke it
$frame_class->getMethod("setDefaultCloseOperation", [ ReflectionTypes::typeInt() ])->invoke($frame, [ $frame_class->getField("EXIT_ON_CLOSE")->get($frame) ]);

// ...
$frame_class->getMethod("setSize", [ 
	ReflectionTypes::typeInt(), // getting ReflectionClass for int (int.class)
	ReflectionTypes::typeInt() 
])->invoke($frame, [ 
	ReflectionTypes::toInt(300), // cast jPHP float to ReflectionObject(int)
	ReflectionTypes::toInt(300)
]);

$pane = $frame_class->getMethod("getContentPane", [])->invoke($frame, []); // getting ReflectionObject(java.awt.Container)
$pane_class = ReflectionClass::forName("java.awt.Container"); // ReflectionClass for java.awt.Container

$button_class = ReflectionClass::forName("javax.swing.JButton");
$button = $button_class->getConstructor([ ReflectionClass::forName("java.lang.String") ])->newInstance([ "Test swing button!" ]);

$pane_class->getMethod("add", [ ReflectionClass::forName("java.awt.Component") ])->invoke($pane, [ $button ]); // ReflectionObject casts to java.lang.Object

$frame_class->getMethod("setVisible", [ ReflectionTypes::typeBool() ])->invoke($frame, [ true ]);
```
