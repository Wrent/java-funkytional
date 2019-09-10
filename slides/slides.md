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
