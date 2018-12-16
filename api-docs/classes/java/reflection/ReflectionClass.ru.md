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
- `->`[`getName()`](#method-getname)
- `->`[`getCanonicalName()`](#method-getcanonicalname)

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

---

<a name="method-getname"></a>

### getName()
```php
getName(): string
```

---

<a name="method-getcanonicalname"></a>

### getCanonicalName()
```php
getCanonicalName(): string
```