# ReflectionClass

- **class** `ReflectionClass` (`java\reflection\ReflectionClass`)
- **source** `java/reflection/ReflectionClass.php`

---

#### Static Methods

- `ReflectionClass ::`[`forName()`](#method-forname)

---

#### Methods

- `->`[`__construct()`](#method-__construct)
- `->`[`newInstance()`](#method-newinstance)
- `->`[`getConstructor()`](#method-getconstructor)
- `->`[`getMethod()`](#method-getmethod)
- `->`[`getField()`](#method-getfield)

---
# Static Methods

<a name="method-forname"></a>

### forName()
```php
ReflectionClass::forName(string $javaClassName): java\reflection\ReflectionClass
```

---
# Methods

<a name="method-__construct"></a>

### __construct()
```php
__construct(): void
```

---

<a name="method-newinstance"></a>

### newInstance()
```php
newInstance(): java\reflection\ReflectionObject
```

---

<a name="method-getconstructor"></a>

### getConstructor()
```php
getConstructor(java\reflection\ReflectionClass $types): java\reflection\ReflectionConstructor
```

---

<a name="method-getmethod"></a>

### getMethod()
```php
getMethod(string $method, java\reflection\ReflectionClass $types): java\reflection\ReflectionMethod
```

---

<a name="method-getfield"></a>

### getField()
```php
getField(string $name): java\reflection\ReflectionField
```