# ReflectionClass

- **класс** `ReflectionClass` (`java\reflection\ReflectionClass`)
- **исходники** `java/reflection/ReflectionClass.php`

---

#### Статичные Методы

- `ReflectionClass ::`[`forName()`](#method-forname)

---

#### Методы

- `->`[`__construct()`](#method-__construct)
- `->`[`newInstance()`](#method-newinstance)
- `->`[`getConstructor()`](#method-getconstructor)
- `->`[`getMethod()`](#method-getmethod)
- `->`[`getField()`](#method-getfield)

---
# Статичные Методы

<a name="method-forname"></a>

### forName()
```php
ReflectionClass::forName(string $javaClassName): java\reflection\ReflectionClass
```

---
# Методы

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