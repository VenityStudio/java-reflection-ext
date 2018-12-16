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
- `->`[`getDeclaredConstructor()`](#method-getdeclaredconstructor)
- `->`[`getMethod()`](#method-getmethod)
- `->`[`getDeclaredMethod()`](#method-getdeclaredmethod)
- `->`[`getField()`](#method-getfield)
- `->`[`getDeclaredField()`](#method-getdeclaredfield)
- `->`[`getMethods()`](#method-getmethods)
- `->`[`getDeclaredMethods()`](#method-getdeclaredmethods)
- `->`[`getConstructors()`](#method-getconstructors)
- `->`[`getDeclaredConstructors()`](#method-getdeclaredconstructors)
- `->`[`getFields()`](#method-getfields)
- `->`[`getDeclaredFields()`](#method-getdeclaredfields)

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

<a name="method-getdeclaredconstructor"></a>

### getDeclaredConstructor()
```php
getDeclaredConstructor(java\reflection\ReflectionClass $types): java\reflection\ReflectionConstructor
```

---

<a name="method-getmethod"></a>

### getMethod()
```php
getMethod(string $method, java\reflection\ReflectionClass $types): java\reflection\ReflectionMethod
```

---

<a name="method-getdeclaredmethod"></a>

### getDeclaredMethod()
```php
getDeclaredMethod(string $method, java\reflection\ReflectionClass $types): java\reflection\ReflectionMethod
```

---

<a name="method-getfield"></a>

### getField()
```php
getField(string $name): java\reflection\ReflectionField
```

---

<a name="method-getdeclaredfield"></a>

### getDeclaredField()
```php
getDeclaredField(string $name): java\reflection\ReflectionField
```

---

<a name="method-getmethods"></a>

### getMethods()
```php
getMethods(): ReflectionMethod[]
```

---

<a name="method-getdeclaredmethods"></a>

### getDeclaredMethods()
```php
getDeclaredMethods(): ReflectionMethod[]
```

---

<a name="method-getconstructors"></a>

### getConstructors()
```php
getConstructors(): ReflectionConstructor[]
```

---

<a name="method-getdeclaredconstructors"></a>

### getDeclaredConstructors()
```php
getDeclaredConstructors(): ReflectionConstructor[]
```

---

<a name="method-getfields"></a>

### getFields()
```php
getFields(): ReflectionField[]
```

---

<a name="method-getdeclaredfields"></a>

### getDeclaredFields()
```php
getDeclaredFields(): ReflectionField[]
```