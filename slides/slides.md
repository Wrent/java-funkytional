class: center, middle

# Java Funky(tional)
## Adam Kučera
![:scale 3%](https://img.icons8.com/office/2x/twitter.png) @Wrent


---
class: center, middle

# Disclaimer


Heavily based on amazing talk by **Brian Vermeer** at Devoxx Poland 2019: [Write better functional Java code](https://www.youtube.com/watch?v=2vCQPI6RXQ8&list=PLRsbF2sD7JVqUucetXQ13Ui46K54YzQYW&index=11&t=0s).


---

class: center, middle

# Functional Java?

---
class: center, middle


# ~~Functional Java?~~

## Java with "functional style of programming"


---

class: center, middle

# Which Java version?

---
class: center, middle

# Do you use functional features?

---

# What we will talk about? 

--
class: center, middle

## Best practices, most of which you might already know

---

# Doing too much in a single lambda

 - basically functions which can be passed as parameter
 - multiple ways of writing lambdas

```java
.map(item -> processItem(item))
```

```java
.map(this::processItem)
```

```java
.map(item -> {
  return processItem(item)
})
```

---

# Returning a Stream

## What is a Stream?

 - NOT a data structure
 - data stream **derived** from a collection
 - intermediate result, which can be terminated by terminal function
 - lazy
 - can be terminated only once

---
# Returning a Stream

## Can you do it?
 
--
 ![:scale 50%](https://i2.wp.com/mgfitlife.com/wp-content/uploads/2016/10/38222418.jpg?ssl=1)
 
---

# Returning a Stream

## Do you know if it was consumed? Can you find out?

```java
Stream<String> getMyBeautifulStream();
```

## Can you do it?

 - private method
 - Stream which is created every time you call it
 - large or infinite streams
 - if you can return collection, just do that instead :)

---

# Order of operations matters

 - Streams are lazy evaluated, but it still matters how you order operations
 - Infinite streams can be useful, but consider other tools
 - be careful with `.parallel()`
 
```java
.limit(5)
```

```java
.distinct()
```

```java
IntStream.iterate(0, i -> i + 1)
```

```java
IntStream.range(0, 10)
```
